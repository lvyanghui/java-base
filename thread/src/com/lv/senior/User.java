package com.lv.senior;

/**
 * Created by lvyanghui on 2018/6/13.
 */
public class User{

    public static final String CITY = "NewYork";

    private String city;
    private int age;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String city, int age) {
        this.city = city;
        this.age = age;
    }

    public synchronized void waitCity() throws InterruptedException {

        while(CITY.equals(city)){
            System.out.println("city is " + city);
            wait();
        }
        System.out.println("city is changed " + city);
    }

    public synchronized void waitAge() throws InterruptedException {

        while(30 > age){
            System.out.println("age is " + age);
            wait();
        }
        System.out.println("age is changed " + age);
    }

    public synchronized void changeCity(){
        this.city = "London";
        notifyAll();
    }

    public synchronized void changeAge(){
        this.age = 35;
        notifyAll();
    }
}
