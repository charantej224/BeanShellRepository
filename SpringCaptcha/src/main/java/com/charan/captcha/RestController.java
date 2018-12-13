package com.charan.captcha;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import de.triology.recaptchav2java.ReCaptcha;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@PostMapping("/validateCaptch")
	public boolean validateToken(@RequestBody Model message) {
		ReCaptcha recaptha = new ReCaptcha("6LdGJnoUAAAAAPDkBLcoCyk3DIZPQYnpnfi0dHM3");
		return false;//recaptha.isValid(message.getCapchaToken());
	}

	@GetMapping("/redirection")
	public ResponseEntity<?> redirectionURL() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:3010/getRedirectionURL",
				String.class);
		String value = responseEntity.getHeaders().get("Location").get(0);
		return responseEntity;
	}

	@GetMapping("/redirectionGoogle")
	public ResponseEntity<?> redirectionURLGoogle() {
		ResponseEntity<String> responseEntity = new ResponseEntity<>("https://www.google.com", HttpStatus.FOUND);
		return responseEntity;
	}

	@GetMapping("/redirect")
	public RedirectView redirectWithUsingRedirectView(RedirectAttributes attributes) {
		return new RedirectView("https://www.google.com");
	}

	@GetMapping("/postRedirect")
	public ResponseEntity<?> postRedirect() throws URISyntaxException {
		final HttpHeaders headers = new HttpHeaders();
		headers.setLocation(new URI("https://www.google.com"));
		final ResponseEntity<Void> entity = new ResponseEntity<Void>(headers, HttpStatus.FOUND);
		return entity;
	}

}
