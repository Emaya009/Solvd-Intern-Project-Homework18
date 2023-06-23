package pharmacy.myBatis.services;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.model.Addresses;
import pharmacy.myBatis.MapperDAO.AddressMapperDAO;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

public class AddressesService implements AddressMapperDAO {

    Logger logger = LogManager.getLogger(AddressesService.class.getName());
    private SqlSessionFactory sqlSessionFactory;

    public AddressesService() {
        try {
            Reader reader = Resources.getResourceAsReader("myBatis_pharmacy_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Addresses> getAllAddress() throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            AddressMapperDAO mapper = session.getMapper(AddressMapperDAO.class);
            return mapper.getAllAddress();
        } finally {
            session.close();
        }
    }

    public Addresses getAddress(int address_id) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            AddressMapperDAO mapper = session.getMapper(AddressMapperDAO.class);
            return mapper.getAddress(address_id);
        } finally {
            session.close();
        }
    }

    public void insertAddress(Addresses addresses) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            AddressMapperDAO mapper = session.getMapper(AddressMapperDAO.class);
            mapper.insertAddress(addresses);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void updateAddress(Addresses addresses) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            AddressMapperDAO mapper = session.getMapper(AddressMapperDAO.class);
            mapper.updateAddress(addresses);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void deleteAddress(int address_id) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            AddressMapperDAO mapper = session.getMapper(AddressMapperDAO.class);
            mapper.deleteAddress(address_id);
            session.commit();
        } finally {
            session.close();
        }
    }
}
