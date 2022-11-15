package org.example;

public class Student implements Comparable<Student> {
    String name;

    public Student(String name){
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        String[] namesThis = this.name.split(" ");
        String[] namesOther = other.name.split(" ");
        int length = Math.min(namesThis.length, namesOther.length);

        for(int i = 0; i < length; i ++){

        }

        return -1;
    }
}
