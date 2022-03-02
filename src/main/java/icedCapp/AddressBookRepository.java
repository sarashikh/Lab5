package icedCapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;



@RepositoryRestResource(collectionResourceRel = "addressBook", path = "addressBook") //collection thing names schema, path names URL
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {


    Optional<AddressBook> findById(Long id); //returns id bc its unique

}
