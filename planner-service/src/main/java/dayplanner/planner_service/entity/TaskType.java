package dayplanner.planner_service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "taskType")
@Data
public class TaskType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "taskName",nullable = false)
    private String taskName;
}
