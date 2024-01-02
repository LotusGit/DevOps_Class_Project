package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dto.CreatorDto;
import ma.xproce.inventoryservice.dto.CreatorDtoInput;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CreatorMapper {
    private ModelMapper modelMapper= new ModelMapper();
    public CreatorDto fromCreatorToCreatorDto(Creator creator){
        return this.modelMapper.map(creator, CreatorDto.class);
    }

    public Creator fromCreatorDtoToCreator(CreatorDto creatorDTO){
        return this.modelMapper.map(creatorDTO, Creator.class);
    }

    public CreatorDtoInput fromCreatorDtoToCreatorDtoInput(CreatorDto creatorDto){
        return this.modelMapper.map(creatorDto, CreatorDtoInput.class);
    }

    public CreatorDto fromCreatorDtoInputToCreatorDto(CreatorDtoInput creatorDtoInput){
        return this.modelMapper.map(creatorDtoInput, CreatorDto.class);
    }

    public CreatorDtoInput fromCreatorToCreatorDtoInput(Creator creator){
        return this.modelMapper.map(creator, CreatorDtoInput.class);
    }

    public Creator fromCreatorDtoInputToCreator(CreatorDtoInput creatorDtoInput){
        return this.modelMapper.map(creatorDtoInput, Creator.class);
    }
}
