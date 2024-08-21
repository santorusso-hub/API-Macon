package com.techprudent.springbootrestcrud.controller;



import com.techprudent.springbootrestcrud.model.User;
import com.techprudent.springbootrestcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findById(@PathVariable(value = "id")  long id) {
		return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
	}

    @RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> findByNameUser(@PathVariable(value = "name")  String name) {
        return new ResponseEntity<>(userService.findByName(name), HttpStatus.OK);
    }

	@RequestMapping(value = "/findByLoginAndPassword/{login}/{password}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findByLoginAndPassword(@PathVariable(value = "login")  String login, @PathVariable(value = "password")  String password) {
		return new ResponseEntity<>(userService.findByLoginAndPassword(login,password), HttpStatus.OK);
	}


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> save(@RequestBody User user) {
		return new ResponseEntity<>(userService.create(user), HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> update(@RequestBody User user) {
		return new ResponseEntity<>(userService.update(user), HttpStatus.OK);
	}

	@RequestMapping(value ="/findAll", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findAll() {
		return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		userService.delete(id);
	}




}
