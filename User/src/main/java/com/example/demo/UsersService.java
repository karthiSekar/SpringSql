package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UsersService {
	@Autowired
	UsersRepository usersRepository;

	public List<Users> getAllUser() {
	return usersRepository.findAll();
	}

	public String postUser(Users users) {
	usersRepository.save(users);
	return "posted";
	}

	public List<Users> getUsersBySalary(Integer salary) {

	return usersRepository.findBySalary(salary);
	}

	public Optional<Integer> getSalary(Integer id) {
	return usersRepository.findSalaryById(id);
	}

	public void deleteUser(Integer id) {
	usersRepository.deleteById(id);
}
}
