package com.example.crud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.student.Student;

public interface S_Repository extends JpaRepository<Student, Integer>{

	List<Student> findByIdBetween(Integer startId, Integer endId);
		@Query("SELECT s FROM Student s WHERE s.id BETWEEN :startId AND :endId")
    List<Student> findStudentsBetweenIdsCustom(
        @Param("startId") Integer startId,   
        @Param("endId") Integer endId);

	List<Student> findByIdLessThan(Integer id);
	
	@Query("SELECT s FROM Student s WHERE s.id < :Id")
	List<Student> findStudentLessThanIdCustomList(@Param("Id") Integer Id);
}
