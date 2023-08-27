package com.example.JPA.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.JPA.Entiry.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
//	we can write custom methods also by just giving appropriate names. name = introducer(find) + criteria(ByName)
//	Use spring JPA documentation in query creation
	public List<User> findByName(String name);
	public List<User> findByNameAndPasssword(String name, String password);
	
//	we can write JPQL or normal query to fetch data
	@Query("select u FROM User u")
	public List<User> findAll();
	
	@Query("SELECT u FROM User u WHERE u.name =:n")
	public List<User> findUserByName(@Param("n") String name);
	
	@Query("select u from User where u.name=:n and u.city=:c")
	public List<User> findUserByNameAndCity(@Param("n") String name, @Param("c") String city);
	
//	to write native query we need to tell it is a native query and query is considered as a value
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> findUser();

}
