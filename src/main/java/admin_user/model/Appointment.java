package admin_user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullname;
    private String mobileNo;
    private String address;
    private String date;
    private String status;
    private String testType;
    private String result01;
    private String result02;
    private String result03;
    private String result04;
    private String token;

    public Appointment() {
        super();
    }

    public Appointment(String fullname, String mobileNo, String address, String date, String status, String testType, String result01, String result02, String result03, String result04, String token) {
        this.fullname = fullname;
        this.mobileNo = mobileNo;
        this.address = address;
        this.date = date;
        this.status = status;
        this.testType = testType;
        this.result01 = result01;
        this.result02 = result02;
        this.result03 = result03;
        this.result04 = result04;
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getResult01() {
        return result01;
    }

    public void setResult01(String result01) {
        this.result01 = result01;
    }

    public String getResult02() {
        return result02;
    }

    public void setResult02(String result02) {
        this.result02 = result02;
    }

    public String getResult03() {
        return result03;
    }

    public void setResult03(String result03) {
        this.result03 = result03;
    }

    public String getResult04() {
        return result04;
    }

    public void setResult04(String result04) {
        this.result04 = result04;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
