package io.javabrains.courseapidata.topic;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;


@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {




}
