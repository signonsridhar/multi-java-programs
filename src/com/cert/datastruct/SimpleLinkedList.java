package com.cert.datastruct;

/**
 * Created by sridhar on 10/5/16.
 */
public class SimpleLinkedList<Emp> {
    private static class Element<Emp>{
        Emp value;
        Element<Emp> next;
    }
    private Element<Emp> head;



    public static void main(String[] args) {
        SimpleLinkedList<Employee> list = new SimpleLinkedList<>();
        Employee e1 = new Employee("Sridhar", "33");
        Employee e2 = new Employee("Hari", "40");
        Employee e3 = new Employee("Ramu", "50");
        SimpleLinkedList.Element el1 = new SimpleLinkedList.Element();
    }
}

class Employee implements Comparable{
    public Employee(String name, String age){
        this.name = name;
        this.age = age;
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

    private String name;
    private String age;


    @Override
    public int compareTo(Object o) {
        Employee e = null;
        if (o != null && o instanceof Employee)
            e = (Employee) o;
        return this.getName().compareTo(e.getName());
    }
}
