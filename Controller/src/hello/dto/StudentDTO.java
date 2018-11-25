package hello.dto;

import model.Student;

public class StudentDTO {
    public String firstName;
    public String lastName;
    public String email;

    StudentDTO from(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.firstName = student.getFirstName();
        dto.lastName = student.getLastName();
        dto.email = student.getEmail();

        return dto;
    }
}
