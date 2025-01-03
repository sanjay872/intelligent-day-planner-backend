package dayplanner.planner_service.repository;

import dayplanner.planner_service.entity.TaskType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskTypeRepository extends JpaRepository<TaskType,Long> {
    Optional<TaskType> findByTaskName(String taskName);
}
