package dayplanner.planner_service.repository;

import dayplanner.planner_service.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PlanRepository extends JpaRepository<Plan,Long> {
    List<Plan> findAllByUserId(long id);
    List<Plan> findAllByUserIdAndPlannedDate(long id, Date date);
}
