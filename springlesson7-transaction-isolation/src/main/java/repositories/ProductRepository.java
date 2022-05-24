package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
	@Autowired //need to autowire to pass the product object into the sql server
	private JdbcTemplate jdbcTemplate;

	
	public void addProduct(String name)
	{
		String sql = "INSERT INTO product VALUES (NULL, ?)";
		jdbcTemplate.update(sql, name);
	}
}
