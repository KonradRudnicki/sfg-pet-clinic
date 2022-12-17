package konradrudnicki.springframework.sfgpetclinic.repositories;

import konradrudnicki.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
