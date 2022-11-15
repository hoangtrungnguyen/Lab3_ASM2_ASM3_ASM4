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
        if(other == null) return 1;
        String[] namesThis = this.name.split(" ");
        String[] namesOther = other.name.split(" ");
        int length = Math.min(namesThis.length, namesOther.length);

        for(int i = length - 1 ; i >= 0; i ++){
            int comparedValue = namesThis[i].compareToIgnoreCase(namesOther[i]);
            if( comparedValue != 0){
                return comparedValue;
            }
        }


        return 0;
    }
}
