package com.RecruitmentApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesingController {
@GetMapping("/testing")
public String getValue() {
	return "RecruitmentApplication working";
}
}
