package ma.xproce.inventoryservice.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder @ToString
public class CreatorDtoInput {
    private String name, email;
}
