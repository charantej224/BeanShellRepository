package com.charan.shell.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charan.shell.configuration.ApplicationContextConfiguration;

import bsh.EvalError;
import bsh.Interpreter;

@RestController
public class BeanShellController {

	@Autowired
	ApplicationContextConfiguration configuration;

	@GetMapping("/getShellResponse")
	public String getResponse(@RequestParam String script) throws EvalError {
		Interpreter interpreter = new Interpreter();
		interpreter.set("value1", 1);
		interpreter.set("value2", 2);
		String value = interpreter.eval(configuration.getScriptFactory().get(script)).toString();
		//Integer integer = (Integer) interpreter.get("result");
		System.out.println(value);
		return configuration.getScriptFactory().get(script);
	}

}
