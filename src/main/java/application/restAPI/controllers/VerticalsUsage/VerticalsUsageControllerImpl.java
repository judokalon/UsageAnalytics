package application.restAPI.controllers.VerticalsUsage;

import application.model.VerticalUsage;
import application.services.VerticalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class VerticalsUsageControllerImpl implements VerticalsUsageControllerAPI {

    @Autowired
    VerticalsService verticalsService;

    //GET
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<VerticalUsage>> getVerticalsUsage(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, @RequestParam("vendor")String vendor){
        List<VerticalUsage> verticalUsageList = verticalsService.getVerticalsUsage(date, vendor);
        return new ResponseEntity<List<VerticalUsage>>(verticalUsageList, HttpStatus.OK);
    }
}
