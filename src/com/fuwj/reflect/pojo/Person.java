package com.fuwj.reflect.pojo;

/**
 * @author fuwj
 * @version 1.0
 * todo
 * @date 2021-06-07 17:40
 */
public class Person {
    String name;
    String age;
    private String male;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", male='" + male + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name, String age, String male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }
}
