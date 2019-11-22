package org.cap.service;


import org.cap.entities.User;

import java.util.List;

public interface IDetailsService {

    //User findUserById(int id);

    User createUser(User user);

    User createUser(String name);

	void addUser(User user);
	 public List<User> getAllUsers();

   // List<User> allUsers();

	//void deleteUser(Integer id);

	//ser updateUser(Integer id, String name);
}
