package org.example;

public class ClassManagement {
    String[] students = new String[]{};


    public String[] sortStudentByName(String[] students){


        for(int i = 0; i < students.length; i ++){
            if(students[i] == null || students[i].isEmpty()){
                for (int j = i ; j < students.length - 1; j++) {
                    students[j] = students[j+1];
                }
            }
        }

        String temp;
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {

                // to compare one string with other strings
                if (students[i].compareTo(students[j]) < 0) {
                    // swapping
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        return students;
    }

}
