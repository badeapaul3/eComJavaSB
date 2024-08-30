package com.ecommerce.project.repositories;

import com.ecommerce.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author hatzp
 **/
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
