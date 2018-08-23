package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	@Query("SELECT t.salary FROM Users t  where t.id = :id")
	Optional<Integer> findSalaryById(@org.springframework.data.repository.query.Param("id")Integer id);

	List<Users> findBySalary(Integer salary);
	

}
