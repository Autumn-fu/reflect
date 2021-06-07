package com.fuwj.reflect;

import com.fuwj.reflect.pojo.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author fuwj
 * @version 1.0
 * todo 反射机制
 * @date 2021-06-07 17:39
 */
public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException {

    }
    /*
    * todo 获取运行时的对象
    * */
    @Test
    public void getPerson() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String classUrl = "com.fuwj.reflect.pojo.Person";
        Class class3 = Class.forName(classUrl);
        //获取对象  无参
        Object object1 = class3.newInstance();
        Person p = (Person) object1;
        System.out.println(p.toString());
        //有参
        Constructor object2 = class3.getDeclaredConstructor(String.class,String.class,String.class);
        //指示反射的对象在使用时应该取消 Java 语言访问检查。值为 false 则指示反射的对象应该实施 Java 语言访问检查;
        //由于JDK的安全检查耗时较多.所以通过setAccessible(true)的方式关闭安全检查就可以达到提升反射速度的目的
        object2.setAccessible(true);
        Person p1 = (Person) object2.newInstance("张三","20","男");
        System.out.println(p1.toString());
    }

    /*
    * todo 反射的实现方法
    * */
    public void createClass() throws ClassNotFoundException {
        //反射使用方法
        //1.调用运行时类的.class属性
        Class class1 = Person.class;
        System.out.println(class1);
        //2.通过运行时类的对象，调用其getClass()方法
        Person p = new Person();
        Class class2 = p.getClass();
        System.out.println(class2);
        //3.调用Class的静态方法forName(String className)。此方法报ClassNotFoundException
        String classUrl = "com.fuwj.reflect.pojo.Person";
        Class class3 = Class.forName(classUrl);
        System.out.println(class3);
    }
}
