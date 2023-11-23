package kodlamaio.northwind.entities.concretes;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="vacancy")
public class Vacancy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="salary_min")
	private int salaryMin;
	
	@Column(name="salary_max")
	private int salaryMax;
	
	@Column(name="position_count")
	private int positionCount;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="announcement")
	private String announcement;
 
	@ManyToOne()
	@JoinColumn(name="company_id")
	private Company company;
	
	@ManyToOne()
	@JoinColumn(name="work_id")
	private WorkPosition workPosition;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
}