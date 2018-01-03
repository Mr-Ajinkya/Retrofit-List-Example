package model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by lenovo on 1/1/2018.
 */

public class EmployeeList {

    @SerializedName("employeeList")
    private ArrayList<Employee> employeeList;

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeList = employeeArrayList;
    }

}
