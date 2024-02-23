package repo;

import db.Compra;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class CompraRepository implements PanacheRepositoryBase<Compra, Integer> {

}