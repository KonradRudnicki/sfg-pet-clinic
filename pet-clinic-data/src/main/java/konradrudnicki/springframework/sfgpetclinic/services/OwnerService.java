package konradrudnicki.springframework.sfgpetclinic.services;

import konradrudnicki.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
