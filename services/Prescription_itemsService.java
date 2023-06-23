package pharmacy.myBatis.services;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.model.Prescription_items;
import pharmacy.myBatis.MapperDAO.Prescription_itemsMapperDAO;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

public class Prescription_itemsService implements Prescription_itemsMapperDAO {
    Logger logger = LogManager.getLogger(Prescription_itemsService.class.getName());
    private SqlSessionFactory sqlSessionFactory;

    public Prescription_itemsService() {
        try {
            Reader reader = Resources.getResourceAsReader("myBatis_pharmacy_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Prescription_items> getAllPrescription_items() throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Prescription_itemsMapperDAO mapper = session.getMapper(Prescription_itemsMapperDAO.class);
            return mapper.getAllPrescription_items();
        } finally {
            session.close();
        }
    }

    public Prescription_items getPrescription_id(int prescription_id) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Prescription_itemsMapperDAO mapper = session.getMapper(Prescription_itemsMapperDAO.class);
            return mapper.getPrescription_id(prescription_id);
        } finally {
            session.close();
        }
    }

    public void insertPrescription(Prescription_items prescriptionItems) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Prescription_itemsMapperDAO mapper = session.getMapper(Prescription_itemsMapperDAO.class);
            mapper.insertPrescription(prescriptionItems);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void updatePrescription(Prescription_items prescriptionItems) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Prescription_itemsMapperDAO mapper = session.getMapper(Prescription_itemsMapperDAO.class);
            mapper.updatePrescription(prescriptionItems);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void deletePrescription(int prescription_id) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Prescription_itemsMapperDAO mapper = session.getMapper(Prescription_itemsMapperDAO.class);
            mapper.deletePrescription(prescription_id);
            session.commit();
        } finally {
            session.close();
        }
    }

}
