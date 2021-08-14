package com.lv.atomic;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by lvyanghui on 2018/6/14.
 */
public class AtomicRef {


    public static void main(String[] args){
        AtomicReference<User> reference = new AtomicReference<>();

        User user = new User("jim",25);
        reference.set(user);
        User newUser = new User("ada",39);

        reference.compareAndSet(user,newUser);
        System.out.println(reference.get().getName() + reference.get().getAge());
    }

    static class User{
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
