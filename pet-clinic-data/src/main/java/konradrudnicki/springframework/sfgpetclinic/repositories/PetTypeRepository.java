package konradrudnicki.springframework.sfgpetclinic.repositories;

import konradrudnicki.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
