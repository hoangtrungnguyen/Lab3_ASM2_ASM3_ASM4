package org.example;

public class ClassManagement {

    public String[] sortStudentByName(String[] names){



        int countNonNull = 0;
        for(String e : names){
            if(e != null && !e.isEmpty()){
                countNonNull += 1;
            }
        }
        Student[] students = new Student[countNonNull];

        int position = 0;
        for (String name : names) {
            if (name != null && !name.isEmpty()) {
                students[position] = new Student(name);
                position += 1;
            }
        }


        Student temp;
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {

                // to compare one string with other strings
                if (students[i].compareTo(students[j]) > 0) {
                    // swapping
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        String[] result = new String[students.length];
        for(int i = 0; i <students.length; i++){
            result[i] = students[i].name;
        }
        return result;
    }

}
