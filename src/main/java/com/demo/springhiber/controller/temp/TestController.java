package com.demo.springhiber.controller.temp;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
	public @ResponseBody ResponseEntity<String> test() {
		JSONObject jsonObject=new JSONObject();
        try {
			jsonObject.put("districts","Test");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
		return new ResponseEntity(jsonObject.toString(), HttpStatus.OK);
	}
}
