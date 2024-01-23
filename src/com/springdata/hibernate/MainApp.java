	package com.springdata.hibernate;

import com.springdata.hibernate.model.Car;
import com.springdata.hibernate.model.Color;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Car.class)
				.addAnnotatedClass(Color.class)
				.buildSessionFactory();
		Session session= (Session) factory.getCurrentSession();

		long id= 4L;
		try {
         session.beginTransaction();
		 Car c= session.get(Car.class, id);

		 session.delete(c);



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
			q.setString("n2","karim");

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
			*/

/*
			//c.setFirstResult(0);
			//c.setMaxResults(4);
			//c.add(Restrictions.in("id",ids));
			//c.add(Restrictions.isNotNull("address"));
			//c.add(Restrictions.isEmpty("address"));
			//c.add(Restrictions.eq("fullName", "yasser"));
			//c.add(Restrictions.like("fullName","m", MatchMode.ANYWHERE));
			Criterion c1=  Restrictions.eq("address","alex");
			Criterion c2=  Restrictions.eq("fullName","solom");
			LogicalExpression or=Restrictions.and(c1,c2);
			c.add(or);
			 */


 /*
	    	 //c.setProjection(Projections.min("id"));
			//c.setProjection(Projections.max("id"));
			//c.setProjection(Projections.avg("id"));
			//c.setProjection(Projections.sum("id"));
			//c.setProjection(Projections.count("address"));
			c.setProjection(Projections.countDistinct("address"));


			List<Client> clients=	c.list();
			System.out.println("countDistinct  :"+clients.get(0));
			//for (int i=0;i< clients.size();i++){
			//	System.out.println(clients.get(i).getFullName()+"    "+clients.get(i).getAge());}

			 Criteria c=session.createCriteria(Client.class);
           */

/* Person p=new Person();
		 p.setName("Eslam Khder");
		 session.save(p);


			Data data=new Data();
		 data.setAge("20");
		 session.save(data);

		 Person p=new Person();
		 p.setId(1L);

		 Person res= session.get(Person.class,p.getId());

			System.out.println("Name : "+ res.getName());
			System.out.println("Age : "+ res.getData().getAge());

			res.setName("Karim");
			res.getData().setAge("50"); */

	 /* Data d= new Data();
		 d.setId(1L);

		Data res= session.get(Data.class,d.getId());

			System.out.println("Name : "+ res.getAge());
			System.out.println("Age : "+ res.getPerson().getName());

			session.delete(res);  */




	/* long id=10;
		 Student student=new Student();
		  student = session.get(Student.class,id);

		  session.close();
		  System.out.println(student.getName());
		   System.out.println(student.getInfos().get(0).getPhone());


			 session.delete(student);

			student.setName("Yasser");
			student.getInfos().get(0).setPhone("015");
			student.getInfos().get(1).setPhone("012");

		System.out.println(student.getName());
		System.out.println(student.getInfos());
		Info info=new Info();
		for (Info i: student.getInfos()){
			System.out.println(i.getPhone());
		}
		 Student student=new Student();
		 student.setName("Ahmed");

		 Info inf01=new Info();
		 inf01.setPhone("0111111111111");

		 Info inf02=new Info();
		 inf02.setPhone("02222222222222");

		 student.getInfos().add(inf01);
		 student.getInfos().add(inf02);
		 inf01.setStudent(student);
		 inf02.setStudent(student);

		 session.save(student);  */

	 /*     Car c1=new Car("Car1");
			Car c2=new Car("Car2");
			Car c3=new Car("Car3");
          //////////////////////////////////////////////
			Color co1=new Color("red");
			Color co2=new Color("blue");
			Color co3=new Color("yellow");
			//////////////////////////////////////////////
			co1.getCars().add(c1);
			co1.getCars().add(c2);
			co1.getCars().add(c3);
			//////////////////////////////////////////////
			co2.getCars().add(c1);
			co2.getCars().add(c2);
			co2.getCars().add(c3);
			//////////////////////////////////////////////
			co3.getCars().add(c1);
			co3.getCars().add(c2);
			co3.getCars().add(c3);

			session.save(co1);
			session.save(co2);
			session.save(co3);



			 session.close();
		 System.out.println(c.getName());
		 for (Car cl: c.getCars()){
			 System.out.println(cl.getName());
		 }*/