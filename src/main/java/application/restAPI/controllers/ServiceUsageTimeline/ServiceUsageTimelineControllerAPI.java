package application.restAPI.controllers.ServiceUsageTimeline;

import application.enums.Service;
import application.model.PlatformUsage;
import application.model.TimeUsage;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;


@RequestMapping("/serviceusagetimeline")
public interface ServiceUsageTimelineControllerAPI {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<TimeUsage>> getServiceUsageTimeline(@RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate, @RequestParam("service") Service service, @RequestParam("vendor")String vendor);
}
