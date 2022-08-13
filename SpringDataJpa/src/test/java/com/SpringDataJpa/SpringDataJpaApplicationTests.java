package com.SpringDataJpa;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.SpringDataJpa.entities.Student;
import com.SpringDataJpa.repos.StudentRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	private StudentRepository repo;

	@Test
	public void testSaveStudent() {
		Student st=new Student();
		st.setId(1l);
		st.setName("sohail");
		st.setTestScore(100);
		repo.save(st);
		Student student = repo.findById(1l).get();
		assertNotNull(student);
		
		
	}

}