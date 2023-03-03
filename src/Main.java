import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        registration reg = new registration();
        String firstName, lastName, birthday, course, email;
        System.out.println("Please Fill out your Registration Form:");
        Scanner input = new Scanner(System.in);

        //firstname
        do {
            System.out.println("Enter your First Name:");
            firstName=input.next();
            if(validation.Name(firstName)== true){
                reg.setFirstName(firstName);
                break;
            }
            else{
                System.out.println("Invalid First Name");
            }
        }
        while (true);

        //lastname
        do {
            System.out.println("Enter your Last Name:");
            lastName=input.next();
            if(validation.Name(firstName)== true){
                reg.setLastName(lastName);
                break;
            }
            else{
                System.out.println("Invalid Last Name");
            }
        }
        while (true);

        //birthday
        do {
            System.out.println("Enter your Birth Date:");
            birthday=input.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate date = LocalDate.parse(birthday, formatter);
            if(validation.birthday(birthday)== true){
                reg.setBirthday(date);
                break;
            }
            else{
                System.out.println("Invalid Format of Birthday | YYYY.MM.DD");
            }
        }
        while (true);

        //course
        do {
            System.out.println("Enter your Course:");
            course=input.next();
            if(validation.course(course)== true){
                System.out.println("Invalid Input");
            }
            else{
                reg.setCourse(course);
                break;

            }
        }
        while (true);

        //email
        do {
            System.out.println("Enter your Email:");
            email=input.next();
            if(validation.email(email)== true){
                reg.setEmail(email);
                break;
            }
            else{
                System.out.println("Invalid Format of Email");
            }

        }
        while (true);

        System.out.println("===============================");
        System.out.println("Student Information");
        System.out.println("Name: " + reg.getFirstName() + " " + reg.getLastName() );
        System.out.println("Your Birth Date: " + reg.getBirthday());
        System.out.println("Course: " + reg.getCourse());
        System.out.println("Your Email: " + reg.getEmail());

        System.out.println("Your generated Student Number is: " + reg.getStudentNumber());


    }
}