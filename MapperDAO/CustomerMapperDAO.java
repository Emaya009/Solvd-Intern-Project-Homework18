package pharmacy.myBatis.MapperDAO;

import pharmacy.model.Customers;

import java.sql.SQLException;
import java.util.List;

public interface CustomerMapperDAO {
    List<Customers> getAllCustomers() throws SQLException;
    Customers getCustomer(int customer_id) throws SQLException;
    void insertCustomer(Customers customer) throws SQLException;
    void updateCustomer(Customers customer) throws SQLException;
    void deleteCustomer(int customer_id) throws SQLException;


}
