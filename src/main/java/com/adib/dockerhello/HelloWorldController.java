package com.adib.dockerhello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

    @Autowired
    DockerHelloWorldService dockerHelloWorldService;

    @RequestMapping("/")
    public String index() throws Exception{
        DockerHelloWorldEntity dockerHelloWorldEntity = new DockerHelloWorldEntity();
        dockerHelloWorldEntity.setUsername("Adib");
        dockerHelloWorldEntity.setPassword("Password");
        DockerHelloWorldEntity savedEntity = dockerHelloWorldService.save(dockerHelloWorldEntity);
        System.out.println("Saved");
        return savedEntity.getUsername();
    }

    @RequestMapping("/{id}")
    public String get(@PathVariable(name = "id") Long id) throws Exception{
       return dockerHelloWorldService.find(id).getUsername();
    }

}