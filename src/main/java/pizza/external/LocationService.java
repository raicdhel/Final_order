
package pizza.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

//@FeignClient(name="location", url="http://location:8080")
@FeignClient(name="location", url="${api.url.location}")
//@FeignClient(name="location", url="http://localhost:8086")
public interface LocationService {

    @RequestMapping(method= RequestMethod.POST, path="/locations")
    public void doSave(@RequestBody Location location);

}