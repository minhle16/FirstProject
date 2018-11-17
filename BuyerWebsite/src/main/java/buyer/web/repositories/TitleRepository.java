package buyer.web.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import buyer.web.entities.Title;

@Repository
public interface TitleRepository extends JpaRepository<Title, Integer> {
	
	/*@Query("SELECT * FROM Title u WHERE u.status = 1")
	Collection<Title> findAllActiveUsers();*/

}