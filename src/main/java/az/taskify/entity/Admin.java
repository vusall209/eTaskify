package az.taskify.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "Admin")
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Admin_Name")
    private String adminName;

    @Column(name = "Admin_email")
    private String adminEmail;

    @Column(name = "Admin_password")
    private String adminPassword;

    @Column(name = "Organization_name")
    private String organizationName;

    @Column(name = "Admin_phoneNumber")
    private String phoneNumber;

    @Column(name = "Addres")
    private String address;
}
