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

        System.out.println(Arrays.toString(classA.sortStudentByName(students)));

        assertArrayEquals(new String[]{
                "Nguyễn Văn An",
                "Trần Văn Bền",
                "Phạm Văn Xuân"
        }, classA.sortStudentByName(students));



    }


}
