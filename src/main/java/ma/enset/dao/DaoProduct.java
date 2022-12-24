package ma.enset.dao;


import ma.enset.dao.entities.Product;

public interface DaoProduct extends Dao<Product> {
    public Product getProduitByQuery();
}
