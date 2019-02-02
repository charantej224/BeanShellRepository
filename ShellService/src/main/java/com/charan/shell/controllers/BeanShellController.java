package com.charan.shell.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charan.shell.configuration.ApplicationContextConfiguration;
import com.charan.shell.models.Employee;
import com.charan.shell.models.PolicyDetails;
import com.fasterxml.jackson.databind.ObjectMapper;

import bsh.EvalError;
import bsh.Interpreter;
import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import groovy.lang.GroovyShell;

@RestController
public class BeanShellController {

	@Autowired
	ApplicationContextConfiguration configuration;

	@GetMapping("/getShellResponse")
	public String getShellResponse(@RequestParam String script) throws EvalError {
		Interpreter interpreter = new Interpreter();
		interpreter.set("value1", 1);
		interpreter.set("value2", 2);
		String value = interpreter.eval(configuration.getScriptFactory().get(script)).toString();
		// Integer integer = (Integer) interpreter.get("result");
		System.out.println(value);
		return configuration.getScriptFactory().get(script);
	}

	@GetMapping("/getGroovyResponse")
	public String getGroovyResponse(@RequestParam String script) throws EvalError, IOException, InstantiationException, IllegalAccessException {
		Binding binding = new Binding();
		PolicyDetails policyDetails = new PolicyDetails();
		policyDetails.setNric("NRICITSME");
		String request = "{\n" + 
				"	\"policyCode\":\"1810345728\",\n" + 
				"	\"call\": \"Y\",\n" + 
				"	\"text\": \"Y\",\n" + 
				"	\"totalFirstPremium\":\"1230.00\",\n" + 
				"	\"creditCardNumber\": \"432312343214\",\n" + 
				"	\"expiryDate\":\"201812\",\n" + 
				"	\"accountName\": \"Mr. Wells\",\n" + 
				"	\"nric\": \"\",\n" + 
				"	\"creditcard\": \"Y\",\n" + 
				"	\"enet\": \"\",\n" + 
				"	\"occupationCode\": \"00D999\"\n" + 
				"}";
		binding.setVariable("policyDetails", policyDetails);
		binding.setVariable("requestDetails", request);
		GroovyShell shell = new GroovyShell(binding);
		Object value;
		long startTime = System.currentTimeMillis();
		value = shell.evaluate(configuration.getScriptFactory().get(script));
		System.out.println(System.currentTimeMillis() - startTime);
		return configuration.getScriptFactory().get(script);
	}

}
