package io.panda.devops.redis.web;

import io.panda.devops.redis.dao.EnvironmentRepository;
import io.panda.devops.redis.domain.Environment;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author godzillahua
 **/
@RestController
@RequestMapping("/env")
public class EnvironmentController {

    private final EnvironmentRepository environmentRepository;

    public EnvironmentController(EnvironmentRepository environmentRepository) {
        this.environmentRepository = environmentRepository;
    }

    @PostMapping("/{name}")
    public ApiResult addEnvironment(@PathVariable("name") String name) {
        Environment environment = new Environment(name);
        Example<Environment> condition = Example.of(environment);
        Optional<Environment> environmentOptional = this.environmentRepository.findOne(condition);
        if (!environmentOptional.isPresent()) {
            this.environmentRepository.save(environment);
        }else {
            return new ApiResult().code(500).message("环境已经存在");
        }
        return new ApiResult();
    }

}
