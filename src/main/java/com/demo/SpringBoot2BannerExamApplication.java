package com.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBoot2BannerExamApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		/*
		 * SpringApplication.run(SpringBoot2BannerExamApplication.class, args);
		 * 
		 * new SpringApplicationBuilder(SpringBoot2BannerExamApplication.class)
		 * .bannerMode(Banner.Mode.OFF).run(args);
		 */	
		
        new SpringApplicationBuilder(SpringBoot2BannerExamApplication.class)
//      .bannerMode(Banner.Mode.OFF)
      .run(args);

		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
