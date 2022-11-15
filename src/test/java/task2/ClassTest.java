package task2;

import jdk.jfr.Description;
import org.example.ClassManagement;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ClassTest {


    @Test
    public void SortStudentsByNameTest(){
        String[] students = new String[]{
                "Phạm Văn Tuấn",
                "Nguyễn Văn An",
                "Trần Văn Bên"
        };
        ClassManagement classA = new ClassManagement();
        String[] result = classA.sortStudentByName(students);
        assertArrayEquals(new String[]{
                "Nguyễn Văn An",
                "Trần Văn Bên",
                "Phạm Văn Tuấn"
        }, result);


    }

    @Test
    @Description("Null or Empty name occur in the list")
    public void SortStudentsByNameTest02(){
        String[] students = new String[]{
                "Phạm Văn Tuấn",
                "",
                null,
                "Nguyễn Văn An",
                "Trần Văn Bên"
        };
        ClassManagement classA = new ClassManagement();
        String[] result = classA.sortStudentByName(students);
        assertArrayEquals(new String[]{
                "Nguyễn Văn An",
                "Trần Văn Bên",
                "Phạm Văn Tuấn"
        }, result);
    }

    @Test
    @Description("Null or Empty name occur in the list")
    public void SortStudentsByNameTest03(){
        String[] students = new String[]{
                "",
                null,
        };
        ClassManagement classA = new ClassManagement();
        String[] result = classA.sortStudentByName(students);
        assertArrayEquals(new String[]{
        }, result);
    }


}
