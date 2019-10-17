package com.lamabdaschool.empolyeeapp;

import java.util.concurrent.atomic.AtomicLong;

public class Employee {

    private static final AtomicLong counter = new AtomicLong();
    private long  id ;
    private String name ;
    private String lastName;
    private double salary;
    private boolean has401k;
    private int companyId;
    private  int healthPlanId;

    public Employee( String name, String lastName, double salary, boolean has401k, int companyId, int healthPlanId) {
        this.id = counter.incrementAndGet();
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.has401k = has401k;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }
   /////////////////////////////////////////
    // coping an object via the constructor
    /////////////////////////////////////////
    public Employee( Employee objToBeClone ) {
        this.id = counter.incrementAndGet();
        this.name = objToBeClone.getName();
        this.lastName = objToBeClone.getLastName();
        this.salary = objToBeClone.getSalary();
        this.has401k = objToBeClone.isHas401k();
        this.companyId =objToBeClone.getCompanyId();
        this.healthPlanId = objToBeClone.getHealthPlanId();
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHas401k() {
        return has401k;
    }

    public void setHas401k(boolean has401k) {
        this.has401k = has401k;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getHealthPlanId() {
        return healthPlanId;
    }

    public void setHealthPlanId(int healthPlanId) {
        this.healthPlanId = healthPlanId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", has401k=" + has401k +
                ", companyId=" + companyId +
                ", healthPlanId=" + healthPlanId +
                '}';
    }
}
