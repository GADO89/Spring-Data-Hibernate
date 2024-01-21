package com.springdata.hibernate;

import com.springdata.hibernate.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.buildSessionFactory();
		Session session= (Session) factory.getCurrentSession();

		Client client=new Client();
		client.setId((long)1);
		client.setFullName("Mahmoud Gado");
		client.setAge(34);
		client.setAddress("gaomahmoud377@gmail.com");

      try {
         session.beginTransaction();

		 session.save(client);

       session.getTransaction().commit();
	  }catch (Exception e){
		  System.out.println(e.toString());
	  }  finally {
      session.close();
	  }

	}

}

/*
		String url="jdbc:mysql://localhost:3306/employee?useSSL=false";
		String username="root";
		String password="gado";

		try {

			Connection connection= DriverManager.getConnection(
					url, username, password
			);
			System.out.println("Connected");
			System.out.println(connection);
		}catch (Exception e){

			System.out.println(e.toString());
		} */

