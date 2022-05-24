package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import services.ProductService;

@Repository
@Transactional //doing this will affect every method inside this class
public class ProductRepositories {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional(propagation = Propagation.MANDATORY)
	public void addProduct(String name) {
		String sql = "INSERT INTO product VALUES (NULL, ?)";
		jdbcTemplate.update(sql, name);
	}
	
	public void getProducts() {
		String sql = "SELECT * FROM product";
		List<String> products = jdbcTemplate.query(sql, new RowMapper<String>() {
			@Override
			public String mapRow(ResultSet resultSet, int i) throws SQLException {
				var p = resultSet.getInt("id")+" " +  resultSet.getString("name");
				return p;
			}
		});
		products.forEach(System.out::println);		
	}
}
