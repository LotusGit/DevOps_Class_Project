package ma.xproce.inventoryservice.service.creator;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.dto.CreatorDto;
import ma.xproce.inventoryservice.dto.CreatorDtoInput;
import ma.xproce.inventoryservice.dto.VideoDto;
import ma.xproce.inventoryservice.mappers.CreatorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class CreatorManagerImpl implements CreatorManager{
    @Autowired
    private CreatorRepository creatorRepository;
    @Autowired
    private CreatorMapper creatorMapper;

    @Override
    public CreatorDto creatorById(Long id) {
        Creator creator = creatorRepository.findById(id).get();
        return creatorMapper.fromCreatorToCreatorDto(creator);
    }

    @Override
    public Collection<CreatorDto> creatorsList() {
         
        return creatorRepository.findAll();
    }

    @Override
    public Collection<VideoDto> creatorVideoList(Long id) {
        return null;
    }

    @Override
    public CreatorDto saveCreator(CreatorDtoInput creatorDtoInput) {
        return null;
    }
}
