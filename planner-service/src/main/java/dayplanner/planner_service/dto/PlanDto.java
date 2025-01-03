package dayplanner.planner_service.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PlanDto {
    private long id;
    private long userId;
    private String name;
    private String location;
    private Date date;
    private String taskName;
    private boolean notify;
    private Date notifyDate;
    private boolean isCompleted;
}
