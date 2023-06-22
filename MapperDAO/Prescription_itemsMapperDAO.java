package pharmacy.myBatis.MapperDAO;

import pharmacy.model.Prescription_items;

import java.sql.SQLException;
import java.util.List;

public interface Prescription_itemsMapperDAO {
    List<Prescription_items> getAllPrescription_items() throws SQLException;
    Prescription_items getPrescription_id(int prescription_id) throws SQLException;
    void insertPrescription(Prescription_items prescriptionItems) throws SQLException;

    void updatePrescription(Prescription_items prescriptionItems) throws SQLException;

    void deletePrescription(int prescription_id) throws SQLException;
}
