package org.example;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public void setGiro(double giro) {
        if (giro >= 0) {
            this.giro = giro;
        } else {
            System.out.println("Giro negatif olamaz!");
        }
    }

    public void addEmployee(int index, String name){
        if(index < 0 || index >= developerNames.length){
            System.out.println("Geçersiz indeks!");
        }
        if (developerNames[index] == null || developerNames[index].isEmpty()) {
            developerNames[index] = name;
        } else {
            System.out.println("İlgili index dolu!");
        }
    }

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if (giro >= 0) {
            this.giro = giro;
        } else {
            System.out.println("Giro negatif olamaz!");
        }
        this.developerNames = developerNames;
    }
}
