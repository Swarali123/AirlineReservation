package org.cap.dao;

import org.cap.entities.User;

import java.util.List;

public interface IDetailsDao {

  //  User findUserById(int id);

    User createUser(User user);

    User createUser(String username);

	void addUser(User user);

	 public List<User> getAllUsers();

  //  List<User> allUsers();

	//void deleteUser(Integer id);

	//User updateUser(Integer id,String name);
}
