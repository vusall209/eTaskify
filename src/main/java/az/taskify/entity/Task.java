package az.taskify.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "Tasks")
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Task_title")
    private String title;

    @Column(name = "Task_description")
    private String description;

    @Column(name = "Task_dedaline")
    private String dedaline;

    @Column(name = "Task_status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;
}
