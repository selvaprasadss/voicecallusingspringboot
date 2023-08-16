package com.springboot;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@RestController
@RequestMapping("/api/v1")
public class PhoneController {
	
	public static final String ACCOUNT_SID="PNeff40749275ff8ef9687673806444c53";
	public static final String AUTH_TOKEN="Constants.AUTH_ID";
	public static final String FROM_NUMBER="+15017250684";
	public static final String TO_NUMBER="+91 8838497929";

	
	static {
		Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
	}
	@GetMapping("/voicecall")
	public String makevoicecall() throws URISyntaxException {
		 Call.creator(new PhoneNumber("+14155551212"),new PhoneNumber("+15017250684"),new URI("http://demo.twilio.com/docs/voice.xml")).create();
	return"please check your mobile ";
	}
}

//http://localhost:8080/api/v1/voicecall
