package School.School.Entity;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class FullSchoolResponse {

    private String name;
    private String email;
    List<Student> students;
}

