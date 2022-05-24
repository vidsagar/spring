package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import model.Product;

//we can use stereotype annotation here
//an alternative would be creating a method in ProjectConfig instead
@Repository
public class ProductRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addProduct(Product product) {
		String sql = "INSERT INTO product VALUES (NULL, ?, ?)";
		jdbcTemplate.update(sql, product.getName(), product.getPrice());
	}

	//using jdbc to get rows from the sql table and creating java objects from it
	public List<Product> getProducts() {
		String sql = "SELECT * FROM product";
		return jdbcTemplate.query(sql, new RowMapper<Product>() {
			@Override
			public Product mapRow(ResultSet resultSet, int i) throws SQLException {
				Product p = new Product();
				p.setId(resultSet.getInt("id"));
				p.setName(resultSet.getString("name"));
				p.setPrice(resultSet.getDouble("price"));
				return p;
			}
		});
	}
}
