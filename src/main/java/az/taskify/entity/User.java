package az.taskify.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.convert.DataSizeUnit;

@Entity
@Data
@Builder
@Table(name = "User")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "User_name")
    private String name;

    @Column(name = "User_surname")
    private String surname;

    @Column(name = "User_email")
    private String email;

    @Column(name = "User_password")
    private String password;
}
