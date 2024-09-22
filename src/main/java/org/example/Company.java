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

    public boolean addEmployee(int index, String name){
        if(index < 0 || index >= developerNames.length){
            System.out.println("Geçersiz indeks!");
            return false;
        }
        if (developerNames[index] == null || developerNames[index].isEmpty()) {
            developerNames[index] = name;
        } else {
            System.out.println("İlgili index dolu!");
        }
        return false;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public double getGiro() {
        return giro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String toString(){
        return "Company [id=" + getId() + ", name=" + getName() + ", giro=" + getGiro() + ", developerNames=" + String.join(", ", getDeveloperNames()) + "]";
    }
}
