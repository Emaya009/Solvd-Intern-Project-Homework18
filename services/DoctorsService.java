package pharmacy.myBatis.services;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.model.Doctors;
import pharmacy.myBatis.MapperDAO.DoctorsMapperDAO;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

public class DoctorsService implements DoctorsMapperDAO {

    Logger logger = LogManager.getLogger(DoctorsService.class.getName());
    private SqlSessionFactory sqlSessionFactory;

    public DoctorsService() {
        try {
            Reader reader = Resources.getResourceAsReader("myBatis_pharmacy_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Doctors> getAllDoctors() throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            DoctorsMapperDAO mapper = session.getMapper(DoctorsMapperDAO.class);
            return mapper.getAllDoctors();
        } finally {
            session.close();
        }
    }

    public Doctors getDoctor(int doctor_id) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            DoctorsMapperDAO mapper = session.getMapper(DoctorsMapperDAO.class);
            return mapper.getDoctor(doctor_id);
        } finally {
            session.close();
        }
    }

    public void insertDoctor(Doctors doctors) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            DoctorsMapperDAO mapper = session.getMapper(DoctorsMapperDAO.class);
            mapper.insertDoctor(doctors);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void updateDoctor(Doctors doctors) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            DoctorsMapperDAO mapper = session.getMapper(DoctorsMapperDAO.class);
            mapper.updateDoctor(doctors);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void deleteDoctor(int doctor_id) throws SQLException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            DoctorsMapperDAO mapper = session.getMapper(DoctorsMapperDAO.class);
            mapper.deleteDoctor(doctor_id);
            session.commit();
        } finally {
            session.close();
        }
    }

}
