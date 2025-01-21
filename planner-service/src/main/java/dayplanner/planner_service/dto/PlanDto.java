package dayplanner.planner_service.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlanDto {
    private long id;
    private long userId;
    private String name;
    private String location;
    private Date plannedDate;
    private Date plannedStartTime;
    private Date plannedEndTime;
    private Date createdDate;
    private Date updatedDate;
    private TaskTypeDto taskName;
    private boolean notify;
    private Date notifyDate;
    private boolean isCompleted;
}
