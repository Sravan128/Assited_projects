package com.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class EmployeeDao {


	public int storeEmployee(Employee emp) {
		try {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");				
		SessionFactory sf = con.buildSessionFactory();		
		Session session = sf.openSession();				
		
		Transaction tran = session.getTransaction();
		tran.begin();
		session.save(emp);								
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	
	
	
//	public List<Employee> getAllEmployee() {
//		List<Employee> listOfEmp =new ArrayList<Employee>();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root@123");
//PreparedStatement pstmt = con.prepareStatement("select * from employee");
//		ResultSet rs = pstmt.executeQuery();
//		while(rs.next()) {
//			Employee emp  = new Employee();
//			emp.setId(rs.getInt(1));
//			emp.setName(rs.getString(2));
//			emp.setSalary(rs.getFloat(3));
//			listOfEmp.add(emp);
//		}
//		} catch (Exception e) {
//		}
//		return listOfEmp;
//	}
	
	
}
