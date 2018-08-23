package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
    private UsersService usersService; 

    @GetMapping(value = "/all")
    public List<Users> getAll() {
        return usersService.getAllUser();
    }

    @PostMapping(value = "/load")
    public String persist(@RequestBody final Users users) {
       
        return usersService.postUser(users);
    }
    
    @GetMapping(value="/all/{salary}") 
    List<Users> getByUsersSalary(@PathVariable("salary") Integer salary){
    	return usersService.getUsersBySalary(salary);
    }
    
    @GetMapping(value="/salarybyId/{id}")
    Optional<Integer> getSalary(@PathVariable("id") Integer id){
    	return usersService.getSalary(id);
    }
    
    @DeleteMapping(value="/delete/{id}")
    String deleteUser(@PathVariable Integer id) {
    	usersService.deleteUser(id);
    	return id +"is deleted";
    }
}
