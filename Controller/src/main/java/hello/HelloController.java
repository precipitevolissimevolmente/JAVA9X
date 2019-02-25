package hello;

import main.java.hello.dto.StudentDTO;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/v2")
public class HelloController {

    @GET
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GET
    @Path("/students")
    @Produces(MediaType.APPLICATION_JSON)
    public List<StudentDTO> getAllStudents() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.firstName = "First Name";
        studentDTO.lastName = "Last Name";
        studentDTO.email = "email";
        return List.of(studentDTO);
    }

    @POST
    @Path("/student")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public StudentDTO getAllStudent(String email) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.firstName = "First Name";
        studentDTO.lastName = "Last Name";
        studentDTO.email = "email";
        return studentDTO;
    }

}