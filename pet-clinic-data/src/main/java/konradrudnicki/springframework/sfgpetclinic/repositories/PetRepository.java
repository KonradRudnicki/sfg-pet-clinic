package konradrudnicki.springframework.sfgpetclinic.repositories;

import konradrudnicki.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
