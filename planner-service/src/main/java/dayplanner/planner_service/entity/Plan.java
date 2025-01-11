package dayplanner.planner_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.Date;

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
    private Date createdDate;

    @Column(name = "updatedDate",nullable = false)
    private Date updatedDate;

    @Column(name = "plannedStartDate",nullable = false)
    private Date plannedStartDate;

    @Column(name = "plannedEndDate",nullable = false)
    private Date plannedEndDate;

    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH
    })
    @JoinColumn(name = "task_type")
    private TaskType task;

    @Column(name = "notify",nullable = false)
    private boolean notify=false;

    @Column(name = "notifyDate",nullable = false)
    private Date notifyDate;

    @Column(name = "isCompleted",nullable = false)
    private boolean isCompleted=false;
}
