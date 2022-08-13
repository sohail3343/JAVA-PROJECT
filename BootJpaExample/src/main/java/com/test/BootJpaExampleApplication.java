package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.Dao.UserRepo;
import com.test.model.User;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(BootJpaExampleApplication.class, args);
		UserRepo repo = run.getBean(UserRepo.class);
		/*
		 * User user =new User(); user.setCity("mumbai"); user.setName("sohail"); User
		 * user1 = repo.save(user); System.out.println(user1);
		 */
		User user1=new User();
		user1.setName("mubashir");
		user1.setCity("mumbra");
		
		User user2=new User();
		user2.setName("md");
		user2.setCity("thane");
		
	//saving single objects	/* User u1 = repo.save(user1); User u2 = repo.save(user2); */
		//saving multiple objects 
	
	
	/*
	 * List<User> l=new ArrayList<User>(); l.add(user2); l.add(user1); List<User>
	 * list = repo.saveAll(l); list.forEach(user->{ System.out.println(user); });
	 */
	 
			//updating the data of user
			/*
			 * Optional<User> optional = repo.findById(11); User user = optional.get();
			 * user.setName("sk"); repo.save(user);
			 */
		
		//fetching
		//how to get the data 
		//find by id();-returns optional containing data 
		/*
		 * List<User> itr = repo.findAll(); itr.forEach(user->{
		 * 
		 * System.out.println(user); });
		 */
			
		
		
		//deleting the data
		//repo.deleteById(8);
		
		//  List<User> alluser = repo.findAll(); repo.deleteAll(alluser);
		  
		
		//by using custom findermethod
		/*
		 * List<User> name = repo.findByName("mubashir");
		 * 
		 * name.forEach(user->System.out.println(user));
		 */
		List<User> nameandcity = repo.findByNameAndCity("mubashir", "mumbra");
		nameandcity.forEach(user-> System.out.println(user));
	
	System.out.println("done");
	}

}