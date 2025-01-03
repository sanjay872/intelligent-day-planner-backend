package dayplanner.planner_service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "planner")
@Data
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

    @Column(name = "date",nullable = false)
    private Date date;

    @Column(name = "task",nullable = false)
    private TaskType task;

    @Column(name = "notify",nullable = false)
    private boolean notify=false;

    @Column(name = "notifyDate")
    private Date notifyDate;

    @Column(name = "isCompleted",nullable = false)
    private boolean isCompleted=false;

    public void setDate(Date date) {
        this.date = new Date();
    }
}
