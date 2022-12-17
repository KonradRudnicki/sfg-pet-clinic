package konradrudnicki.springframework.sfgpetclinic.repositories;

import konradrudnicki.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
