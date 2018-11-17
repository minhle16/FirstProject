package buyer.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import buyer.web.entities.Role;





@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Role findByRole(String role);

}
