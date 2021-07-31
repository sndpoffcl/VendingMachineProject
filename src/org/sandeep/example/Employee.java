package org.sandeep.example;

public class Employee {
    private int id;
    private int age;
    private String name;
    private String address;
    private Gender gender;
    private Designation designation;

    public Employee(int id, int age, String name, String address, Gender gender, Designation designation) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.designation = designation;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }
}

/*
    Employee
    Name
    Age
    Address
    Id
    Gender - Male, Female, Man , Woman, M , F
    Designation - Senior Software Engineer, Sr S/W Engineer, SDE 2


    ENUM
 */