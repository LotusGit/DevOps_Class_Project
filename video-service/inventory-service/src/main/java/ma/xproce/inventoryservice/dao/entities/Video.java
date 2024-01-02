package ma.xproce.inventoryservice.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Video {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name, url, description;
    private Date datePublication;
    @ManyToOne
    private Creator creator;
}
