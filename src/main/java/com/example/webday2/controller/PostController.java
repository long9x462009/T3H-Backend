package com.example.webday2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday2.rest.model.CreateStudentRequest;

import java.util.List;

@RestController
@RequestMapping("/post-endpoints")
public class PostController {

	@PostMapping("/string")
	public String string(@RequestBody String s) {
		return String.format("Ai doi oi: %s", s);
	}

	@PostMapping("/person")
	public String postPerson(@RequestBody CreateStudentRequest restPerson) {
		return String.format("Person name is: %s", restPerson.getFullName());
	}

	@PostMapping("/people")
	public String postPerson(@RequestBody List<CreateStudentRequest> people){

		StringBuilder sb = new StringBuilder();
		for (CreateStudentRequest p: people){

			sb.append(p.getFullName() + ", ");
		}
		return sb.toString();
	}

}
