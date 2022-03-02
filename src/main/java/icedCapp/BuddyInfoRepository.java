package icedCapp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "buddy", path = "buddy")
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {
    List<BuddyInfo> findByName(String name);
    Optional<BuddyInfo> findById(Long id); //returns id bc its unique

}
