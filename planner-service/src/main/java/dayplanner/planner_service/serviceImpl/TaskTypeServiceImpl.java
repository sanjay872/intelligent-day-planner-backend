package dayplanner.planner_service.serviceImpl;

import dayplanner.planner_service.entity.TaskType;
import dayplanner.planner_service.repository.TaskTypeRepository;
import dayplanner.planner_service.service.TaskTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskTypeServiceImpl implements TaskTypeService {

    private final TaskTypeRepository taskTypeRepository;

    @Autowired
    public TaskTypeServiceImpl(TaskTypeRepository taskTypeRepository){
        this.taskTypeRepository=taskTypeRepository;
    }


    @Override
    public List<TaskType> getTaskTypes() {
        return this.taskTypeRepository.findAll();
    }
}
