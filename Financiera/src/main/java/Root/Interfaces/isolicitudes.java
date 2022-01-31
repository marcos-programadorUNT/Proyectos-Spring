package Root.Interfaces;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Root.Modelos.msolicitudes;


@Transactional
public interface isolicitudes extends JpaRepository<msolicitudes, Integer>{

	@Modifying
	@Query(
			value="update solicitud set estado='A' where numero=:numero",
			nativeQuery=true
		  )
	void aprobarSolicitud(@Param("numero") Integer numero);
	
	@Modifying
	@Query(
			value="update solicitud set estado='D' where numero=:numero",
			nativeQuery=true
		  )
	void desaprobarSolicitud(@Param("numero") Integer numero);
	
	@Query(
			value="select * from solicitud where dni=:numero limit 1",
			nativeQuery=true
		  )
	msolicitudes buscarSolicitud(@Param("numero") Integer numero);
	
	@Modifying
	@Query(
			value="insert into solicitud (cuotas, estado, monto, dni) values (:cuotas,:estado,:monto,:dni)",
			nativeQuery=true
		  )
	void insertarSolicitud(@Param("estado") String estado, @Param("cuotas") int cuotas, @Param("monto") double monto, @Param("dni") int dni);
	
}
