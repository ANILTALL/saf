package com.RecruitmentApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecruitmentApplication{// extends SpringBootServletInitializer {
	//private static Class<RecruitmentApplication> entryPointClass = RecruitmentApplication.class;


	public static void main(String[] args) {
		SpringApplication.run(RecruitmentApplication.class, args);
	}
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(entryPointClass);
	}*/

}
