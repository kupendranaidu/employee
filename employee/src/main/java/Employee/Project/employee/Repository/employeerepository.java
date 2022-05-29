package Employee.Project.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Employee.Project.employee.model.employee;


@Repository
public interface employeerepository extends JpaRepository<employee,Long> {

}

