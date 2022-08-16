package pe.com.nttdata.cliente.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pais implements Serializable{

	@Id
	@SequenceGenerator(
			name = "pais_id_sequence",
			sequenceName = "pais_id_sequence"
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "pais_id_sequence"
	)
	@Column(name = "pais_id")
	private int id;

	@Column(name = "pais_nombre")
	private String nombre;

	
}
