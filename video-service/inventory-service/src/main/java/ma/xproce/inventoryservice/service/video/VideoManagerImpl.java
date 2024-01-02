package ma.xproce.inventoryservice.service.video;

import ma.xproce.inventoryservice.dao.repositories.VideoRepository;
import ma.xproce.inventoryservice.dto.VideoDto;
import ma.xproce.inventoryservice.dto.VideoDtoInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class VideoManagerImpl implements VideoManager{

    @Autowired
    private VideoRepository videoRepository;
    @Override
    public VideoDto videoByName(String name){
        return null;
    }
    @Override
    public Collection<VideoDto> videoList(){
        return videoRepository.findAll();
    }
    @Override
    public VideoDto saveVideo(VideoDtoInput videoDtoInput){
        return null;
    }
}
