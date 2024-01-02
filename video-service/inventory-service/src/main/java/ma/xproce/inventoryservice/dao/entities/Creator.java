package ma.xproce.inventoryservice.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Creator {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name, email;
    @OneToMany(mappedBy = "creator")
    private Collection<Video> videos;
}
