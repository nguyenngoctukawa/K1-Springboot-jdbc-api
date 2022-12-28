package com.example.nbs.springbasic.springboot_jdbc_api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJdbcApiApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerDAO playerDao;
	@Override
	public void run(String... args) throws Exception {
		logger.info("All Players Data: {}", playerDao.getAllPlayers());

		logger.info("Player with Id 3: {}", playerDao.getPlayerById(3));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcApiApplication.class, args);
	}

}
