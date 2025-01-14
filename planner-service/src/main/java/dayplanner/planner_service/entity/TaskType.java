package dayplanner.planner_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    @OneToMany(mappedBy = "task",cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH
    })
    private List<Plan> plans;
}
