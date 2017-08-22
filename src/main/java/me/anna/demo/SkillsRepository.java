package me.anna.demo;


import me.anna.demo.models.Skills;
import org.springframework.data.repository.CrudRepository;

public interface SkillsRepository extends CrudRepository<Skills,Long> {
}
