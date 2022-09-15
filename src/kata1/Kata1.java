package kata1;

import java.util.Date;


public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Blas", new Date(102, 10, 25));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
