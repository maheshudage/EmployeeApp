package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.model.Users;

@Repository
public class UserDao {

	@Autowired
	SessionFactory sf;

	public void saveUser(Users user) {
		Session ssn = sf.openSession();
		ssn.save(user);
		ssn.beginTransaction().commit();
	}

	public boolean verifyLoginDetails(Users user) {
		Session ssn = sf.openSession();
		Query<Users> res = ssn.createQuery("from Users u where u.username = :uname and u.password = :pwd", Users.class)
				.setParameter("uname", user.getUsername()).setParameter("pwd", user.getPassword());
		Users u = res.uniqueResult();
		return (u != null);
	}

	public List<Users> getAllUsers() {
		Session ssn = sf.openSession();
		return ssn.createQuery("from Users", Users.class).list();
	}

}
