package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dto.VideoDto;
import ma.xproce.inventoryservice.dto.VideoDtoInput;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class VideoMapper {
    private ModelMapper modelMapper= new ModelMapper();

    public Video fromVideoDtoToVideo(VideoDto videoDTO){
        return this.modelMapper.map(videoDTO, Video.class);
    }

    public VideoDto fromVideoToVideoDto(Video video){
        return this.modelMapper.map(video, VideoDto.class);
    }

    public VideoDtoInput fromVideoDtoToVideoDtoInput(VideoDto videoDto){
        return this.modelMapper.map(videoDto, VideoDtoInput.class);
    }

    public Video fromVideoDtoInputToVideo(VideoDtoInput videoDtoInput){
        return this.modelMapper.map(videoDtoInput, Video.class);
    }

    public VideoDto fromVideoDtoInputToVideoDto(VideoDtoInput videoDtoInput){
        return this.modelMapper.map(videoDtoInput, VideoDto.class);
    }

    public VideoDtoInput fromVideoToVideoDtoInput(Video video){
        return this.modelMapper.map(video, VideoDtoInput.class);
    }
}
