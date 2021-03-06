package com.niit.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.ProfilePicture;
@Repository
@Transactional
public class ProfilePictureDaoImpl implements ProfilePictureDao{
	   @Autowired
	private SessionFactory sessionFactory;
	   @Override
		public void uploadProfilePicture(ProfilePicture profilePicture) {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(profilePicture);
	   }
	
	@Override
	public ProfilePicture getProfilePic(String email) {
		Session session=sessionFactory.getCurrentSession();
		ProfilePicture profilePicture=(ProfilePicture)session.get(ProfilePicture.class, email);
		System.out.println("DAO " + email + " " + profilePicture);
		return profilePicture;
	}

	
	
		

	}

