package org.example;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    private void addHealthplan(int index, String name){
        if(index < 0 || index >= healthplans.length){
            System.out.println("Geçersiz index!");
        }
       if( healthplans[index] == null || healthplans[index].isEmpty()){
           healthplans[index] = name;
       } else {
           System.out.println("İlgili index dolu!");
       }
    }
    public Employee(long id, String fullName, String email, String password, String[] healthplans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }
}
