package com.intothemobile.itmadmin.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intothemobile.itmadmin.model.Greeting;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

	@ApiOperation(
			httpMethod = "GET"
			, value = "Rest API greeting"
			, notes = "Return greeting message"
			, nickname = "greeting"
			, response = Greeting.class
	)
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "name", value = "Name", defaultValue="World", required = false, dataType = "String", paramType="query")
    })
	@RequestMapping(path = "/greeting", method = RequestMethod.GET)
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.debug("greeting");
		logger.debug(name);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
