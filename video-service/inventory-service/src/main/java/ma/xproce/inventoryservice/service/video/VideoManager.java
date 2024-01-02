package ma.xproce.inventoryservice.service.video;

import ma.xproce.inventoryservice.dto.VideoDto;
import ma.xproce.inventoryservice.dto.VideoDtoInput;

import java.util.Collection;

public interface VideoManager {

    /**
     *  videoByName(name: String): [VideoDto]
     *  videoList: [VideoDto]
     *  saveVideo(videoDtoInput: VideoDtoInput): VideoDto
     */

    public VideoDto videoByName(String name);
    public Collection<VideoDto> videoList();
    public VideoDto saveVideo(VideoDtoInput videoDtoInput);
}
