package com.example.nbs.springbasic.dataaccess;

import com.example.nbs.springbasic.dataaccess.SpringJdbcApi.Player;
import com.example.nbs.springbasic.dataaccess.SpringJdbcApi.PlayerDAO;
import com.example.nbs.springbasic.dataaccess.SpringJdbcApi.TournamentDAO;
import com.example.nbs.springbasic.dataaccess.SpringjdbcJPA.PlayerEntity;
import com.example.nbs.springbasic.dataaccess.SpringjdbcJPA.PlayerRepository;
import com.example.nbs.springbasic.dataaccess.SpringjdbcJPA.SpringDataJPAPlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class SpringbootDataaccessApplication implements CommandLineRunner {// implements commandLineRunner =>
	//  Public void Run
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerDAO playerDao;
	@Autowired
	TournamentDAO tournamentDAO;
	@Autowired
	PlayerRepository playerRepository;

	@Autowired
	SpringDataJPAPlayerRepository springDataJPAPlayerRepository;
	@Override
	public void run(String... args) throws Exception {
//		SpringDataJPA();
//		SpringJdbcApi();
		SpringDataRepositoryEx();


	}
//	private void SpringDataJPA() {
//		// ex1
//		logger.info("\n\n>> Inserting Player: {}\n", playerRepository.insertPlayer(
//				new PlayerEntity("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
//
//		logger.info("\n\n>> Inserting Player: {}\n", playerRepository.insertPlayer(
//				new PlayerEntity("Monfils", "France", Date.valueOf("1986-09-01"), 10)));
//
//		// ex2
//		logger.info("\n\n>> Player with id 2: {}\n", playerRepository.getPlayerById(2));
//
//		// ex3
//		logger.info("\n\n>> Inserting Player: {}\n", playerRepository.insertPlayer(
//				new PlayerEntity("Thiem", "Austria",
//						new Date(System.currentTimeMillis()), 17)));
//		logger.info("\n\n>> Updating Player with Id 3: {}\n", playerRepository.updatePlayer(
//				new PlayerEntity(3, "Thiem", "Austria", Date.valueOf("1993-09-03"), 17)));
//		logger.info("\n\n>> Player with id 3: {}\n", playerRepository.getPlayerById(3));
//
//		logger.info("\n\n>> All Players Data: {}", playerRepository.getAllPlayers());
//
//
//		//delete player
//		playerRepository.deleteById(2);
//	}
//
//	private void SpringJdbcApi() {
//		tournamentDAO.createTournamentTable();
//
//		logger.info("French Players: {}", playerDao.getPlayerByNationality("France"));
//
//
//		logger.info("Inserting Player 4: {}", playerDao.insertPlayer(
//				new Player (4, "Thiem", "Austria", new Date(System.currentTimeMillis()), 17 ))
//		);
//
//		logger.info("Updating Player with Id 4: {}", playerDao.updatePlayer(
//				new Player(4, "Thiem", "Austria", Date.valueOf("1993-09-03"), 17))
//		);
//
//		logger.info("Deleting Player with Id 2: {}", playerDao.deletePlayerById(2));
//
//		logger.info("All Players Data: {}", playerDao.getAllPlayers());
//
//		logger.info("Player with Id 3: {}", playerDao.getPlayerById(3));
//
//	}
	private void SpringDataRepositoryEx() {
		//Inserting rows
		logger.info("Inserting Player: {}", springDataJPAPlayerRepository.save(new PlayerEntity("Djokovic", "Serbia",
				Date.valueOf("1987-05-22"), 81)));
		logger.info("Inserting Player: {}", springDataJPAPlayerRepository.save(new PlayerEntity("Monfils", "France",
				Date.valueOf("1986-09-01"), 10)));
		logger.info("Inserting Player: {}", springDataJPAPlayerRepository.save(new PlayerEntity("Thiem", "Austria",
				new Date(System.currentTimeMillis()), 17)));

		//Updating row
		logger.info("Updating Player with Id 3: {}", springDataJPAPlayerRepository.save(new PlayerEntity(3, "Thiem", "Austria",
				Date.valueOf("1993-09-03"), 17)));

		logger.info("Player with Id 2: {}", springDataJPAPlayerRepository.findById(2));

		logger.info("All Players Data: {}", springDataJPAPlayerRepository.findAll());

		springDataJPAPlayerRepository.deleteById(2);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataaccessApplication.class, args);
	}

}
