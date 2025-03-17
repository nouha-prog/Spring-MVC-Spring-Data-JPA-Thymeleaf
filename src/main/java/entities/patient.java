package entities;
import lombok.NoArgsConstructor;

import java.util.data;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder


public class patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom ;
    private Date dateNaissance; 
    private boolean malade;
    private int score;  


}
