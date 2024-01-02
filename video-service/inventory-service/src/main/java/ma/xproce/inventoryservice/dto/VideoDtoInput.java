package ma.xproce.inventoryservice.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder @ToString
public class VideoDtoInput {
    private String name, url, description;
    private CreatorDtoInput creator;
}
