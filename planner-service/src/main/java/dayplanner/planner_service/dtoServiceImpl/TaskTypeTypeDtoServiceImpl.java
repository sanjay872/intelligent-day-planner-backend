package dayplanner.planner_service.dtoServiceImpl;

import dayplanner.planner_service.dataMapper.TaskTypeMapper;
import dayplanner.planner_service.dto.TaskTypeDto;
import dayplanner.planner_service.dtoService.TaskTypeDtoService;
import dayplanner.planner_service.service.TaskTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskTypeTypeDtoServiceImpl implements TaskTypeDtoService {

    private final TaskTypeMapper taskTypeMapper;
    private final TaskTypeService taskTypeService;

    @Autowired
    TaskTypeTypeDtoServiceImpl(TaskTypeMapper taskTypeMapper, TaskTypeService taskTypeService){
        this.taskTypeMapper=taskTypeMapper;
        this.taskTypeService=taskTypeService;
    }

    @Override
    public List<TaskTypeDto> getTaskTypes() {
        return taskTypeService.getTaskTypes().stream().map(taskTypeMapper::toDto).collect(Collectors.toList());
    }
}
