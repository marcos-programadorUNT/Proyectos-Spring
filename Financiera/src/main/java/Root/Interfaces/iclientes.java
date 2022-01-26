package Root.Interfaces;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Root.Modelos.mclientes;


@Transactional
public interface iclientes extends JpaRepository<mclientes, Integer>{
	
	
	@Query(
			value="select * from clientemarcos where dni=:numero limit 1",
			nativeQuery=true
		  )
	mclientes buscarCliente(@Param("numero") Integer numero);
	
	
	@Modifying
	@Query(
			value="update clientemarcos set correo=:correo where dni=:numero",
			nativeQuery=true
		  )
	void actualizarCorreo(@Param("numero") Integer numero,@Param("correo") String correo);

}
