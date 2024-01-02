package ma.xproce.inventoryservice.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class CreatorDto {
    private String name, email;
}
