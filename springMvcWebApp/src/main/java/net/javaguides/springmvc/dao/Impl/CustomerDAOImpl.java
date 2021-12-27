package net.javaguides.springmvc.dao.Impl;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.javaguides.springmvc.dao.CustomerDAO;
import net.javaguides.springmvc.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List < Customer > getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Customer > cq = cb.createQuery(Customer.class);
        Root < Customer > root = cq.from(Customer.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Customer book = session.byId(Customer.class).load(id);
        session.delete(book);
    }

    public void saveCustomer(Customer theCustomer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theCustomer);
    }

    public Customer getCustomer(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Customer theCustomer = currentSession.get(Customer.class, theId);
        return theCustomer;
    }
}
/*public class EmployeeDaoImpl implements EmployeeDao {

public int saveEmployee(Employee employee) {
	Integer id = 0;
	try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		session.beginTransaction();
		id = (Integer) session.save(employee);
		session.getTransaction().commit();
	} catch (HibernateException e) {

		e.printStackTrace();
	}
	return id;
}

public Employee getEmployeeById(int employeeId) {
	Employee employee=null;
	try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		employee=session.get(Employee.class, employeeId);
		if(employee!=null) {
			System.out.println("Employee Found!!");
		}
		else {
			System.out.println("Employee not found with id:"+employeeId);
		}
	} catch (HibernateException e) {

		e.printStackTrace();
	}
	return employee;
}

public void updateEmployeeById(int employeeId, Employee employeeTO) {
	Employee employee=null;
	try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		employee=session.get(Employee.class, employeeId);
		if(employee!=null) {
			//employee.setEmployeeName(employeeTO.getEmployeeName());
			//employee.setEmail(employeeTO.getEmail());//dynamic update
			employee.setEmployeeName(employeeTO.getEmployeeName());
			employee.setEmail(employeeTO.getEmail());
			employee.setSalary(employeeTO.getSalary());
			
			session.beginTransaction();
			session.update(employee);
			session.getTransaction().commit();
		}
		else {
			System.out.println("Employee not found!!");
		}
	} catch (HibernateException e) {

		e.printStackTrace();
	}

}

public void deleteEmployeeById(int employeeId) {
	Employee employee=null;
	try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		employee=session.get(Employee.class, employeeId);
		if(employee!=null) {
			session.beginTransaction();
			session.delete(employee);
			session.getTransaction().commit();
		}
		else {
			System.out.println("Employee not found with id:"+employeeId);
		}
	} catch (HibernateException e) {

		e.printStackTrace();
	}

}

}
*/