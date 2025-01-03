package dayplanner.planner_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "planner")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "userId",nullable = false)
    private long userId;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "createdDate",nullable = false,updatable = false)
    private Instant createdDate;

    @Column(name = "updatedDate",nullable = false)
    private Instant updatedDate;

    @Column(name = "plannedDate",nullable = false)
    private Instant plannedDate;

    @ManyToOne()
    @JoinColumn(name = "task_type")
    private TaskType task;

    @Column(name = "notify",nullable = false)
    private boolean notify=false;

    @Column(name = "notifyDate",nullable = false)
    private Instant notifyDate;

    @Column(name = "isCompleted",nullable = false)
    private boolean isCompleted=false;
}
