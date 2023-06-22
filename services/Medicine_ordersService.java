package pharmacy.myBatis.services;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.model.Medicine_orders;
import pharmacy.myBatis.MapperDAO.Medicine_ordersMapperDAO;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

public class Medicine_ordersService {
    Logger logger = LogManager.getLogger(Medicine_ordersService.class.getName());
    private SqlSessionFactory sqlSessionFactory;

    public Medicine_ordersService() {
        try {
            Reader reader = Resources.getResourceAsReader("myBatis_pharmacy_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Medicine_orders> getAllMedicines() throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Medicine_ordersMapperDAO mapper = session.getMapper(Medicine_ordersMapperDAO.class);
            return mapper.getAllMedicines();
        } finally {
            session.close();
        }
    }

    public Medicine_orders getMedicineOrder(int order_id) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Medicine_ordersMapperDAO mapper = session.getMapper(Medicine_ordersMapperDAO.class);
            return mapper.getMedicineOrder(order_id);
        } finally {
            session.close();
        }
    }

    public void insertMedicineOrder(Medicine_orders medicineOrders) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Medicine_ordersMapperDAO mapper = session.getMapper(Medicine_ordersMapperDAO.class);
            mapper.insertMedicineOrder(medicineOrders);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void updateMedicineOrder(Medicine_orders medicineOrders) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Medicine_ordersMapperDAO mapper = session.getMapper(Medicine_ordersMapperDAO.class);
            mapper.updateMedicineOrder(medicineOrders);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void deleteMedicineOrder(int order_id) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Medicine_ordersMapperDAO mapper = session.getMapper(Medicine_ordersMapperDAO.class);
            mapper.deleteMedicineOrder(order_id);
            session.commit();
        } finally {
            session.close();
        }
    }

}
