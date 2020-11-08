package com.example.myapplication;

import java.util.ArrayList;
import java.util.Objects;

public class User {


    //Just some things we need for each user
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    //Contrusctor for temporary objects used inb comparison
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //Constructor for new Users


    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        numOfUsers++;
        listOfUsers.add(this);
    }

    //Now to create some static variables and methods that will act as utility
    //ie getters and setters
    private static int numOfUsers = 0;
    private static ArrayList<User> listOfUsers = new ArrayList<User>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getNumOfUsers() {
        return numOfUsers;
    }

    public static void setNumOfUsers(int numOfUsers) {
        User.numOfUsers = numOfUsers;
    }

    public static ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }

    public static void addToListOfUsers(User in) {
        User.listOfUsers.add(in);
    }

    //This methods checks to see if the user exists
    public static boolean loginCheck(User in){
        if(User.listOfUsers.contains(in)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getEmail().equals(user.getEmail()) &&
                getPassword().equals(user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getPassword());
    }
}
