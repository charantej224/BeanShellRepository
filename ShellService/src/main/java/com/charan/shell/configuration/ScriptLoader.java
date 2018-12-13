package com.charan.shell.configuration;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class ScriptLoader {

	@Autowired
	ResourceLoader resourceLoader;

	@Autowired
	ApplicationContextConfiguration appContext;

	@Value("${script.files}")
	String[] scriptFiles;

	public void loadScriptFiles() {
		Arrays.asList(scriptFiles).forEach(scriptFile -> {
			try {
				Resource resource = resourceLoader.getResource("classpath:scriptfiles/" + scriptFile);
				String scriptString = IOUtils.toString(resource.getInputStream(), StandardCharsets.UTF_8);
				appContext.getScriptFactory().put(scriptFile, scriptString);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		});

	}

	@PostConstruct
	public void init() {
		loadScriptFiles();
	}

}
