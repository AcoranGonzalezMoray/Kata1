package kata1;


import java.time.LocalDate;



public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 11, 25);
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
