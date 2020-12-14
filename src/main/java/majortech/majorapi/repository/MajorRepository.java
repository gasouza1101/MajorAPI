package majortech.majorapi.repository;

import majortech.majorapi.model.MajorApiModel;
import org.springframework.data.repository.CrudRepository;

public interface MajorRepository extends CrudRepository<MajorApiModel, Integer> {

}
