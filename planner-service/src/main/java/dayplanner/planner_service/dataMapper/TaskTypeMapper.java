package dayplanner.planner_service.dataMapper;

import dayplanner.planner_service.dto.TaskTypeDto;
import dayplanner.planner_service.entity.TaskType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskTypeMapper {
    TaskType fromDto(TaskTypeDto taskTypeDto);
    TaskTypeDto toDto(TaskType taskType);
}
