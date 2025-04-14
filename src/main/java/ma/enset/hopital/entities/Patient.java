package ma.enset.hopital.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data   // Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
@Builder  //
@Entity  // entiter GPA
public class Patient {
     @Id  // generer le id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @NotEmpty
     @Size(min = 4, max = 40)
     private String nom;
     @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "yyyy-MM-dd")
     private Date dateNaissance;
     private boolean malade;
     @DecimalMin("100")
     private int score;
}