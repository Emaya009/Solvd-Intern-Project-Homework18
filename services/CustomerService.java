package pharmacy.myBatis.services;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.model.Customers;
import pharmacy.myBatis.MapperDAO.CustomerMapperDAO;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

public class CustomerService {

    Logger logger = LogManager.getLogger(CustomerService.class.getName());
        private SqlSessionFactory sqlSessionFactory;

        public CustomerService() {
            try {
                Reader reader = Resources.getResourceAsReader("myBatis_pharmacy_config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public List<Customers> getAllCustomers() throws SQLException {
            SqlSession session = sqlSessionFactory.openSession();
            try {
                CustomerMapperDAO mapper = session.getMapper(CustomerMapperDAO.class);
                return mapper.getAllCustomers();
            } finally {
                session.close();
            }
        }

        public Customers getCustomer(int customer_id) throws SQLException {
            SqlSession session = sqlSessionFactory.openSession();
            try {
                CustomerMapperDAO mapper = session.getMapper(CustomerMapperDAO.class);
                return mapper.getCustomer(customer_id);
            } finally {
                session.close();
            }
        }

        public void insertCustomer(Customers customer) throws SQLException {
            SqlSession session = sqlSessionFactory.openSession();
            try {
                CustomerMapperDAO mapper = session.getMapper(CustomerMapperDAO.class);
                mapper.insertCustomer(customer);
                session.commit();
            } finally {
                session.close();
            }
        }

        public void updateCustomer(Customers customer) throws SQLException {
            SqlSession session = sqlSessionFactory.openSession();
            try {
                CustomerMapperDAO mapper = session.getMapper(CustomerMapperDAO.class);
                mapper.updateCustomer(customer);
                session.commit();
            } finally {
                session.close();
            }
        }

        public void deleteCustomer(int customer_id) throws SQLException {
            SqlSession session = sqlSessionFactory.openSession();
            try {
                CustomerMapperDAO mapper = session.getMapper(CustomerMapperDAO.class);
                mapper.deleteCustomer(customer_id);
                session.commit();
            } finally {
                session.close();
            }
        }
    }


