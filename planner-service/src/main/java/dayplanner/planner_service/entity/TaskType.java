package dayplanner.planner_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "taskType")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "taskName",nullable = false)
    private String taskName;
}
