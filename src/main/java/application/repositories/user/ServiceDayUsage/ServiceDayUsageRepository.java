package application.repositories.user.ServiceDayUsage;

import application.model.PlatformsDayUsage;
import application.model.ServiceDayUsage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Collection;
import java.util.Date;

public interface ServiceDayUsageRepository extends MongoRepository<ServiceDayUsage, String> {

//  @Query("{ date : { $gte : { $date : 2015-05-16T07:55:23.257Z}},  $lte : { $date : 2015-05-16T07:55:23.257Z}}}")
    public ServiceDayUsage findOneByDate(Date date);

    @Query(value = "{'date':{ $gte: ?0, $lte: ?1}}")
    public Collection<ServiceDayUsage> findByDateBetween(Date from, Date to);

}