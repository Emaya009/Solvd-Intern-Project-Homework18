package pharmacy.myBatis.MapperDAO;

import pharmacy.model.Doctors;

import java.sql.SQLException;
import java.util.List;

public interface DoctorsMapperDAO {
    List<Doctors> getAllDoctors() throws SQLException;
    Doctors getDoctor(int doctor_id) throws SQLException;
    void insertDoctor(Doctors doctors) throws SQLException;

    void updateDoctor(Doctors doctors) throws SQLException;

    void deleteDoctor(int doctor_id) throws SQLException;
}
