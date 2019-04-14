package com.adib.dockerhello;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DockerHelloWorldService {

    @Autowired
    private DockerHelloWorldRepository dockerHelloWorldRepository;

    public DockerHelloWorldEntity save(DockerHelloWorldEntity dockerHelloWorldEntity) throws Exception{
        DockerHelloWorldEntity savedEntity = dockerHelloWorldRepository.save(dockerHelloWorldEntity);

        if(savedEntity != null) {
            return savedEntity;
        }else {
            throw new Exception("Error");
        }
    }

    public DockerHelloWorldEntity find(Long id) throws Exception{
        Optional<DockerHelloWorldEntity> foundEntity = dockerHelloWorldRepository.findById(id);

        if(foundEntity.isPresent()) {
            return foundEntity.get();
        }else{
            throw new Exception("Error");
        }
    }
}
