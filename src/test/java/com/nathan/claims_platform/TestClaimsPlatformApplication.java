package com.nathan.claims_platform;

import org.springframework.boot.SpringApplication;

public class TestClaimsPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.from(ClaimsPlatformApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
