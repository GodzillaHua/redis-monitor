package io.panda.devops.redis.dao;

import io.panda.devops.redis.domain.Environment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author godzillahua
 **/
public interface EnvironmentRepository extends JpaRepository<Environment, Integer> {
}
