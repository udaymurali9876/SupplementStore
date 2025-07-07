package com.example.Supplements.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Supplements.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	//own implemented methods with native queries
	
	List<User> findByUserName(String userName);//select *from user_details where user_name = userName
	List<User> findByUserNameAndPassword(String userName, String password);
	//select *from user_details where user_name = userName And password = password

}