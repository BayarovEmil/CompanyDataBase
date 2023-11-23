package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.WorkPosition;

public interface WorkPositionDao extends JpaRepository<WorkPosition, Integer>{

}
