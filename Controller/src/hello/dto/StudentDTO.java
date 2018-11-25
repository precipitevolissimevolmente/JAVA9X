package hello.dto;

import model.Student;

public class StudentDTO {
    private String firstName;
    private String lastName;
    private String email;

    StudentDTO from(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.firstName = student.getFirstName();
        dto.lastName = student.getLastName();
        dto.email = student.getEmail();

        return dto;
    }
}
