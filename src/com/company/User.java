package com.company;
import java.util.Random;
public class User {
    private String firstName;
    private String secondName;
    private int id;
    private int age;
    private String gender;
    private String password;
    private String dateOfBirth;
    Random random = new Random();

    public User(String firstName, String secondName, int age, String gender, String password, String dateOfBirth) {
        setFirstName(firstName);
        setSecondName(secondName);
        setAge(age);
        setId(random.nextInt(10000));
        setGender(gender);
        setPassword(password);
        setDateOfBirth(dateOfBirth);
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getSecondName(){
        return secondName;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }



    public void print(){
        System.out.println("Id: " + id);
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Password: " + password);
    }
}
