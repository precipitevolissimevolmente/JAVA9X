package hello;

import hello.dto.StudentDTO;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = "application/json")
    public List<StudentDTO> getAllStudents() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.firstName = "First Name";
        studentDTO.lastName = "Last Name";
        studentDTO.email = "email";
        return List.of(studentDTO);
    }
}