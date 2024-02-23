package School.School.Entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Student {

    private String fullname;
    private String email;
}