import java.time.LocalDate;

public class registration {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String course;
    private String email;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getStudentNumber() {
        String year = Integer.toString(LocalDate.now().getYear());
        String day = String.format("%02d", birthday.getDayOfMonth());
        String surnameInitial = Character.toString(lastName.charAt(0));
        return year + "-" + day + "01-" + surnameInitial;
    }



}
