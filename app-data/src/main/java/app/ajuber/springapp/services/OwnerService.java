package app.ajuber.springapp.services;

import app.ajuber.springapp.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    //updated
    Owner findByLastName(String lastName);

}
