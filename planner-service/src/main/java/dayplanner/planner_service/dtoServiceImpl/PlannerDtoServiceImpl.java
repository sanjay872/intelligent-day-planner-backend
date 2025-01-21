package dayplanner.planner_service.dtoServiceImpl;

import dayplanner.planner_service.dataMapper.PlanDataMapper;
import dayplanner.planner_service.dto.PlanDto;
import dayplanner.planner_service.dtoService.PlannerDtoService;
import dayplanner.planner_service.service.PlannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlannerDtoServiceImpl implements PlannerDtoService {

    private final PlanDataMapper planDataMapper;
    private final PlannerService plannerService;

    @Autowired
    public PlannerDtoServiceImpl(PlanDataMapper planDataMapper, PlannerService plannerService){
        this.planDataMapper=planDataMapper;
        this.plannerService=plannerService;
    }

    @Override
    public long createPlan(PlanDto planDto) {
        return plannerService.createPlan(planDataMapper.fromDto(planDto));
    }

    @Override
    public PlanDto getPlanById(long id) {
        return planDataMapper.toDto(plannerService.getPlanById(id));
    }

    @Override
    public List<PlanDto> getPlanByUserId(long id) {
        return plannerService.getPlanByUserId(id).stream().map(planDataMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void updatePlan(PlanDto planDto) {
        plannerService.updatePlan(planDataMapper.fromDto(planDto));
    }

    @Override
    public void deletePlanById(long id) {
        plannerService.deletePlanById(id);
    }

    @Override
    public List<PlanDto> getPlanByUserIdAndDate(long id, Date date) {
        return plannerService.getPlanByUserIdAndDate(id,date).stream().map(planDataMapper::toDto).collect(Collectors.toList());
    }
}
