package Student.Student.Controller;

import Student.Student.Entity.Student;
import Student.Student.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping({"createStudent"})
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Student student) {

        service.saveStudent(student);
    }

    @GetMapping({"getStudent"})
    public ResponseEntity<List<Student>> findAllStudents() {

        return ResponseEntity.ok(service.findAllStudents());
    }

    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<Student>> findAllStudents(@PathVariable("school-id") Integer schoolId) {
        return ResponseEntity.ok(service.findAllStudentsBySchool(schoolId));
    }
}
