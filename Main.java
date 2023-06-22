package pharmacy.myBatis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.model.Addresses;
import pharmacy.model.Doctors;
import pharmacy.myBatis.services.*;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        /*
        This project below demonstrates how to work with mybatis XML mapping:
        One-to-One relationship: one customer can have only one customer id
        One-to-Many relationship: one customer  can be associated with one or more address
        Many-to-Many relationship: Each prescription id have many products
         */

        Logger logger = LogManager.getLogger(Main.class.getName());

        CustomerService customerService = new CustomerService();
        //Select customer details based on customer id entered
        logger.info("Select customer by Id  \n" + customerService.getCustomer(4125));

       //Insert new address into the address table
        Addresses addAddress = new Addresses(4123, "23 MAycox LAne", "New Jersey", "New York", "United States");
        AddressesService address = new AddressesService();
        address.insertAddress(addAddress);

       //Insertion of new doctor details in doctor table
        DoctorsService doctorsService = new DoctorsService();
        Doctors addDoctor = new Doctors(12, 4123, "Ram", "Charan", "7723948292", "ramcharan@gmail.com");
        DoctorsService doctor = new DoctorsService();
        doctor.insertDoctor(addDoctor);

        //Updating the address detail in address table
        Addresses setAddress = address.getAddress(4123);
        setAddress.setAddress_id(4120);
        address.updateAddress(setAddress);

        //Updating the doctor details in doctor table
        Doctors setDoctor = doctorsService.getDoctor(1221);
        setDoctor.setAddress_id1(4120);
        setDoctor.setFirst_name("Dr.Ram");
        setDoctor.setLast_name("Chandran");
        setDoctor.setPhone("6792356320");
        setDoctor.setEmail("ramchandran@gmail.com");
        doctorsService.updateDoctor(setDoctor);

        //Listing all the customer,medicine order and prescription details from the corresponding tables
        Prescription_itemsService prescriptionList = new Prescription_itemsService();
        logger.info("List all the prescription items: \n" + prescriptionList.getAllPrescription_items());
        logger.info("List all the customers \n" + customerService.getAllCustomers());
        Medicine_ordersService medicineList = new Medicine_ordersService();
        logger.info("List all the medicine orders \n" + medicineList.getAllMedicines());
        //Listing the details of medicine ordered based on the order id entered
        logger.info("Get medicine order based on the order id: " + medicineList.getMedicineOrder(15));

        //Deleting the medicine order detail based on the order id entered
        logger.info("Delete the medicine order based on the order id:");
        medicineList.deleteMedicineOrder(10);

    }
}
