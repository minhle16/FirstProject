package course.mon.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import course.mon.web.entities.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
