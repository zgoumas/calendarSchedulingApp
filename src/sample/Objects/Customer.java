package sample.Objects;

/**
 * This holds the "InHouse" class, an extension of the part class.
 *
 * @ Zach Goumas
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Time;
import java.sql.Timestamp;

public class Customer {
    private ObservableList<PartToBeAppointment> associatedAppintments = FXCollections.observableArrayList();
    private int id;
    private String customerName;
    private String address;
    private String postalCode;
    private String phone;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp lastUpdated;
    private String lastUpdatedBy;
    private int divisionID;




    public Customer(int id, String customerName, String address, String postalCode, String phone, Timestamp createdDate, String createdBy, Timestamp lastUpdated, String lastUpdatedBy, int divisionID) {
        this.id = id;
        this.customerName = customerName;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.lastUpdated = lastUpdated;
        this.lastUpdatedBy = lastUpdatedBy;
        this.divisionID = divisionID;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public String getCreatedBy() { return createdBy; }

    public Timestamp getLastUpdated() { return lastUpdated; }

    public String getLastUpdatedBy() { return lastUpdatedBy; }

    public int getDivisionID() { return divisionID; }
    

    //THIS IS WHERE I LEFT OFF
    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public void getCreatedBy(String createdBy) { this.createdBy = createdBy; }

    public void getLastUpdated(Timestamp lastUpdated) { this.lastUpdated = lastUpdated; }

    public void getLastUpdatedBy(String lastUpdatedBy) { this.lastUpdatedBy = lastUpdatedBy; }

    public void getDivisionID(int divisionID) { this.divisionID = divisionID; }




    public void addAssociatedPart(PartToBeAppointment part) {
        associatedAppintments.add(part);
    }

    public boolean deleteAssociatedPart(PartToBeAppointment selectedAssociatedPart) {
        associatedAppintments.remove(selectedAssociatedPart);
        return true;
    }

    public ObservableList<PartToBeAppointment> getAllAssociatedParts() {
        return associatedAppintments;
    }
}
