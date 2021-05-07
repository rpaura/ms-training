package com.rpaura.hruser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrUserApplication implements CommandLineRunner{

//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}
	
	@Override
	public void run(String... args ) throws Exception {
		//Gerar senha quando necessário
		//System.out.print("BCRYPT = " + passwordEncoder.encode("124556"));
	}

}
