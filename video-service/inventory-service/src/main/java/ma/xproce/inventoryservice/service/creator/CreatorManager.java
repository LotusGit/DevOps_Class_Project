package ma.xproce.inventoryservice.service.creator;

import ma.xproce.inventoryservice.dto.CreatorDto;
import ma.xproce.inventoryservice.dto.CreatorDtoInput;
import ma.xproce.inventoryservice.dto.VideoDto;

import java.util.Collection;

public interface CreatorManager {
    /**
     * creatorById(id: Float): CreatorDto
     *     creatorsList: [CreatorDto]
     *     creatorVideoList(id: Float): [VideoDto]
     *     creatorByName(name: String): [CreatorDto]
     *
     *         saveCreator(creatorDtoInput: CreatorDtoInput): CreatorDto
     */

    public CreatorDto creatorById(Long id);
    public Collection<CreatorDto> creatorsList();
    public Collection<VideoDto> creatorVideoList(Long id);
    public CreatorDto saveCreator(CreatorDtoInput creatorDtoInput);
}
