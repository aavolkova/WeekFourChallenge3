package me.anna.demo;


import me.anna.demo.models.Employment;
import org.springframework.data.repository.CrudRepository;

public interface EmploymentRepository extends CrudRepository<Employment,Long> {
}
