package ma.xproce.inventoryservice.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class VideoDto {
    private String name, url, description;
    private CreatorDto creator;
}
