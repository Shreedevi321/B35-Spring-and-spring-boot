package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/*JPARepository is exists in spring data JPA dependencies and it contains 
 * all the CURD operation of spring JPA
 */
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
}
