package sandeep.simplespringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceNameController {

    @Autowired
    private BuildProperties buildProperties;


    @GetMapping("/serviceName")
    public String getServiceName() {

        return "Jenkins Pipeline service";
    }
}
