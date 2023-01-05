package az.raheddin.springbootactuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class MyController {


    @Autowired
    UserEntity entity;

    @GetMapping("/data")
    public UserEntity getEntity() {
        return entity;
    }
}
