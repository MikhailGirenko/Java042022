package ru.gb.girenko.homework5;

public class Employees {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;
    private int salary;

    public Employees(String fullName,String position,String email,String phoneNumber,int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        setAge(age);
    }
    public void setAge(int age) {
        if(age>=0 || age < 150){
            this.age = age;
        }else {
            System.out.println("ВВеден некорректный возрост");
        }
    }
    public void print(){
        System.out.println("ФИО: "+fullName);
        System.out.println("Должность: "+position);
        System.out.println("Email: "+email);
        System.out.println("Номер телефона: "+phoneNumber);
        System.out.println("Зарплата: "+salary);
        System.out.println("Возраст: "+age);
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
