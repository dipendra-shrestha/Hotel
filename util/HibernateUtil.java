package org.inspirationtech.util;


import java.util.Iterator;

import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.inspirationtech.food.Food;
import org.inspirationtech.food.FoodCategory;
import org.inspirationtech.food.FoodIngredient;
import org.inspirationtech.food.FoodPreparation;
import org.inspirationtech.food.IngredientCategory;
import org.inspirationtech.order.CustomerBill;
import org.inspirationtech.order.CustomerOrder;
import org.inspirationtech.order.CustomerOrderDetail;
import org.inspirationtech.personnel.Address;
import org.inspirationtech.personnel.Customer;
import org.inspirationtech.table.CustomerTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HibernateUtil {

	static Session session; 
	private static final Logger logger=LoggerFactory.getLogger(HibernateUtil.class);
	
	public HibernateUtil(){
		try
		{
			//DBConnection();
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		try
		{
			//DBConnection();
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
	}

	private static void DBConnection() throws Exception
	{
		if(session==null||session.isOpen()==false){
			
			logger.info("Trying to create a connect with database");
			System.out.println("Trying to create a connect with database");
			
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
					
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			SessionFactory factory = configuration.buildSessionFactory(serviceRegistryBuilder.build());
			session=factory.openSession();
			session.setFlushMode(FlushMode.AUTO);
			
			logger.info("Connection with database is successful");
			System.out.println("Connection with database is successful");
		}
	}
	
	
	public SessionFactory getSessionFactory(){
		
		logger.info("Trying to create a connect with database");
		System.out.println("Trying to create a connect with database");
		
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
				
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(serviceRegistryBuilder.build());
		
		return factory;
	}
	
	private void closeDBConnection(){
		try{
			session.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public CustomerTable getCustomerTable(){
		
		CustomerTable customerTable = new CustomerTable();

		if(!session.getTransaction().isActive()){
			Transaction tx = session.beginTransaction();
			Query qry=session.createQuery("from CustomerTable where Priority='Normal'");
			customerTable=(CustomerTable)qry.uniqueResult();
			
			if(!tx.wasCommitted()){
				
				tx.commit();
			}
			session.clear();
			System.out.print("ID of Table is :"+ customerTable.getCustomerTableID());
			
		}
			
		return customerTable;	
	}
	
	public Object getEntityObject(Class<?> obj,String ID){
		Transaction tx=null;
		SessionFactory sessionFactory=null;
		Session session=null;
		try{
			sessionFactory =getSessionFactory();
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			tx.setTimeout(5);
			Object returnObject=session.get(obj,ID);
			tx.commit();
			return returnObject;
		}catch(RuntimeException ex){
			try{
				tx.rollback();
			}catch(RuntimeException rex){
				logger.error("Could not roll back transaction",rex);
			}
		}finally{
			session.close();
		}
		return new Object();
	}
	
//	public boolean saveCustomerTable(CustomerTable customerTable){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(customerTable);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	public boolean saveWaiter(Waiter waiter){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(waiter);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	public boolean saveFoodCategory(FoodCategory foodCategory){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(foodCategory);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	public boolean saveFood(Food food){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(food);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	public boolean saveCustomer(Customer customer){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(customer);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	public boolean saveCustomerOrder(CustomerOrder customerOrder){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(customerOrder);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	public boolean saveFoodIngredient(FoodIngredient foodIngredient){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(foodIngredient);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	public boolean saveCustomerBill(CustomerBill customerBill){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(customerBill);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	public boolean saveCustomerOrderDetail(CustomerOrderDetail customerOrderDetail){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(customerOrderDetail);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	public boolean saveIngredientCategory(IngredientCategory ingredientCategory){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(ingredientCategory);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	
//	public boolean saveFoodPreparation(FoodPreparation foodPreparation){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(foodPreparation);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	
//	public boolean saveAddress(Address address){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(address);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	
//	public boolean saveCashier(Cashier cashier){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			session.saveOrUpdate(cashier);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//	
//	public boolean deleteCustomerTable(String ID){
//		Transaction tx=null;
//		SessionFactory sessionFactory=null;
//		Session session=null;
//		try{
//			sessionFactory =getSessionFactory();
//			session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			tx.setTimeout(5);
//			CustomerTable customerTable=(CustomerTable) session.get(CustomerTable.class, ID);
//			session.delete(customerTable);
//			tx.commit();
//			return true;
//		}catch(RuntimeException ex){
//			try{
//				tx.rollback();
//			}catch(RuntimeException rex){
//				logger.error("Could not roll back transaction",rex);
//			}
//		}finally{
//			session.close();
//		}
//		return false;
//	}
	
	public boolean saveOrUpdateEntityObject(Object obj){
		Transaction tx=null;
		SessionFactory sessionFactory=null;
		Session session=null;
		try{
			sessionFactory =getSessionFactory();
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			tx.setTimeout(5);
			session.saveOrUpdate(obj);
			tx.commit();
			return true;
		}catch(RuntimeException ex){
			try{
				tx.rollback();
			}catch(RuntimeException rex){
				logger.error("Could not roll back transaction",rex);
			}
		}finally{
			session.close();
		}
		return false;
	}
	
	public boolean updateEntityObject(Object obj){
		Transaction tx=null;
		SessionFactory sessionFactory=null;
		Session session=null;
		try{
			sessionFactory =getSessionFactory();
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			tx.setTimeout(5);
			session.update(obj);
			tx.commit();
			return true;
		}catch(RuntimeException ex){
			try{
				tx.rollback();
			}catch(RuntimeException rex){
				logger.error("Could not roll back transaction",rex);
			}
		}finally{
			session.close();
		}
		return false;
	}
	
	public boolean deleteEntityObject(Object obj){
		Transaction tx=null;
		SessionFactory sessionFactory=null;
		Session session=null;
		try{
			sessionFactory =getSessionFactory();
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			tx.setTimeout(5);
			
			session.delete(obj);
			tx.commit();
			return true;
		}catch(RuntimeException ex){
			try{
				tx.rollback();
			}catch(RuntimeException rex){
				logger.error("Could not roll back transaction",rex);
			}
		}finally{
			session.close();
		}
		return false;
	}
	
	public Iterator executeQuery(String HqlQuery){
		Transaction tx=null;
		SessionFactory sessionFactory=null;
		Session session=null;
		Iterator resultlist=null;
		try{
			sessionFactory =getSessionFactory();
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			tx.setTimeout(5);
			
			Query query=session.createQuery(HqlQuery);
			resultlist=query.iterate();
			tx.commit();
			return resultlist;
		}catch(RuntimeException ex){
			try{
				tx.rollback();
			}catch(RuntimeException rex){
				logger.error("Could not roll back transaction",rex);
			}
		}finally{
			session.close();
		}
		return resultlist;
		
	}
}
