package dayplanner.planner_service.dataMapper;

import dayplanner.planner_service.dto.PlanDto;
import dayplanner.planner_service.entity.Plan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.Instant;
import java.time.ZoneId;

@Mapper(componentModel = "spring")
public interface PlanDataMapper {
//    @Mapping(target = "task.taskName",source = "taskName")
//    @Mapping(target = "createdDate",source = "createdDate",qualifiedByName = "convertStringToDate")
//    @Mapping(target = "updatedDate",source = "updatedDate",qualifiedByName = "convertStringToDate")
//    @Mapping(target = "plannedStartDate",source = "plannedStartDate",qualifiedByName = "convertStringToDate")
//    @Mapping(target = "plannedEndDate",source = "plannedEndDate",qualifiedByName = "convertStringToDate")
//    @Mapping(target = "notifyDate",source = "notifyDate",qualifiedByName = "convertStringToDate")
    Plan fromDto(PlanDto planDto);

//    @Mapping(target = "taskName",source = "task.taskName")
//    @Mapping(target = "createdDate",source = "createdDate",qualifiedByName = "convertDateToString")
//    @Mapping(target = "updatedDate",source = "updatedDate",qualifiedByName = "convertDateToString")
//    @Mapping(target = "plannedStartDate",source = "plannedStartDate",qualifiedByName = "convertDateToString")
//    @Mapping(target = "plannedEndDate",source = "plannedEndDate",qualifiedByName = "convertDateToString")
//    @Mapping(target = "notifyDate",source = "notifyDate",qualifiedByName = "convertDateToString")
    PlanDto toDto(Plan plan);

//    @Named("convertStringToDate")
//    default Instant convertStringToDate(String date){
//        if(date.isEmpty()){
//            return null;
//        }
//        Instant instant=Instant.parse(date);
//        return instant.atZone(ZoneId.of("UTC")).toInstant();
//    }
//
//    @Named("convertDateToString")
//    default String convertStringToDate(Instant date){
//        if(date==null) {
//            return "";
//        }
//        return date.toString();
//    }
}
