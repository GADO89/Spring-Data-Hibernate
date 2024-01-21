package com.springdata.hibernate;

import com.springdata.hibernate.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.buildSessionFactory();
		Session session= (Session) factory.getCurrentSession();

		int id=1;
		try {
         session.beginTransaction();
		 Query q1=session.createQuery("select Max(id) from Client ");
		 Query q2=session.createQuery("select Min(id) from Client ");
		 Query q3=session.createQuery("select Sum(id) from Client ");
		 Query q4=session.createQuery("select avg(age) from Client ");
		 Query q5=session.createQuery("select count(address) from Client ");
		 Query q6=session.createQuery("select count(distinct address) from Client ");






			System.out.println("  Max "+q1.list().get(0));
			System.out.println("  Min "+q2.list().get(0));
			System.out.println("  Sum "+q3.list().get(0));
			System.out.println("  avg "+q4.list().get(0));
			System.out.println("  Sum "+q5.list().get(0));
			System.out.println("  Sum "+q6.list().get(0));




			  /*List<Client> clients=	q.list();
					//.list();
			//System.out.println(clients);
			for (int i=0;i< clients.size();i++){
				System.out.println(clients.get(i).getFullName()+"    "+clients.get(i).getAge());
			}
			//System.out.println(c.getFullName()+"     "+c.getAddress());
              */
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

/*

Client client=new Client("Mahmoud Gado",34,"gaomahmoud377@gmail.com");
		//client.setId((long)1);

		Client client2=new Client("Mahmoud Gado",34,"gaomahmoud377@gmail.com");
		//client2.setId((long)2);

		Client client3=new Client("Mahmoud Gado",34,"gaomahmoud377@gmail.com");
		//client3.setId((long)3);


		  session.save(client);
		  session.save(client2);
		  session.save(client3);

		*/




   /*
			Client client=session.get(Client.class, id);
			client.setFullName("Yasser");
			client.setAge(33);
			client.setAddress("Alex");
			Client c=new Client("Karim",33,"cairo");
			c.setId((long)1);
			session.update(c);

            Client c=new Client();
			c.setId(3L);
            session.delete(c);
			session.getTransaction().commit();   */




//List<Client> clients=
			/* Query q=
					session
					.createQuery("from Client c where c.id=: n1 or fullName=: n2");
			//q.setFirstResult(0);
			//q.setMaxResults(3);
			q.setInteger("n1",id);
			q.setString("n2","karim");  */