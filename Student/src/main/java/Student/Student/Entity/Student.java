package Student.Student.Entity;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.*;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullname;
    private String email;
    private Integer schoolId;
}
