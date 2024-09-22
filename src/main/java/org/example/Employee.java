package org.example;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public boolean addHealthPlan(int index, String name){
        if(index < 0 || index >= healthPlans.length){
            System.out.println("Geçersiz index!");
            return false;
        }
       if( healthPlans[index] == null || healthPlans[index].isEmpty()){
           healthPlans[index] = name;
       } else {
           System.out.println("İlgili index dolu!");
       }
       return false;
    }
    public Employee(long id, String fullName, String email, String password, String[] healthplans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthplans;
    }

    public long getId() {
        return id;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthplans) {
        this.healthPlans = healthplans;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString() {
        String healthPlanString = String.join(", ", getHealthPlans());
        return "Employee [id=" + getId() + ", fullName=" + getFullName() + ", email=" + getEmail() + ", healthplans=" + healthPlanString + "]";
    }

}
