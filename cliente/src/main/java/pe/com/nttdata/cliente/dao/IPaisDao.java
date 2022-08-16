package pe.com.nttdata.cliente.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.nttdata.cliente.model.Pais;

public interface IPaisDao extends JpaRepository<Pais, Integer> {
}
