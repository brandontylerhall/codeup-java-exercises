import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = {new Person("Brandon"), new Person("Ricky"), new Person("Tiberius")};

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

//    public static Person addPerson() {
//
//    }

}
