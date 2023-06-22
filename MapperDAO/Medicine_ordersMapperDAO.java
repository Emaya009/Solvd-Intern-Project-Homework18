package pharmacy.myBatis.MapperDAO;

import pharmacy.model.Medicine_orders;

import java.sql.SQLException;
import java.util.List;

public interface Medicine_ordersMapperDAO {

    List<Medicine_orders> getAllMedicines() throws SQLException;
    Medicine_orders getMedicineOrder(int order_id) throws SQLException;
    void insertMedicineOrder(Medicine_orders medicineOrders) throws SQLException;

    void updateMedicineOrder(Medicine_orders medicineOrders) throws SQLException;

    void deleteMedicineOrder(int order_id) throws SQLException;

}
