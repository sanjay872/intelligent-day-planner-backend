package dayplanner.planner_service.dataMapper;

import dayplanner.planner_service.dto.PlanDto;
import dayplanner.planner_service.entity.Plan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlanDataMapper {
    @Mapping(target = "task.taskName",source = "taskName")
    Plan fromDto(PlanDto planDto);

    @Mapping(target = "taskName",source = "task.taskName")
    PlanDto toDto(Plan plan);
}
