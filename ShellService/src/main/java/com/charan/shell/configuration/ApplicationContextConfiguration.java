package com.charan.shell.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ApplicationContextConfiguration {
	private Map<String, String> scriptFactory = new HashMap<>();

	public Map<String, String> getScriptFactory() {
		return scriptFactory;
	}

	public void setScriptFactory(Map<String, String> scriptFactory) {
		this.scriptFactory = scriptFactory;
	}
}
