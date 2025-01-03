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
    private String plannedDate;
    private String createdDate;
    private String updatedDate;
    private String taskName;
    private boolean notify;
    private String notifyDate;
    private boolean isCompleted;
}
