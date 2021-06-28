package com.service.asset;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.service.asset.model.User;

public class DAM {
	 public static void main(String[] args) {
	        EntityManagerFactory efact = null;
	        EntityManager eman = null; 
	        try {
		        efact = Persistence.createEntityManagerFactory("dam");
		        eman = efact.createEntityManager();
	            eman.getTransaction().begin();
			    User user= new User();
			    user.setEmail("a@a.com");
			    user.setName("admin");
	            eman.persist(user);
	            eman.getTransaction().commit();
	        } catch (Exception e) {
	        	e.printStackTrace();
	        } finally {
	            eman.close();
	            efact.close();
	        }
	 }
}
