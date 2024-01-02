package ma.xproce.inventoryservice.web;

import org.springframework.stereotype.Controller;

@Controller
public class VideoGraphQlController {
    /*
    private CreatorRepository creatorRepository;
    private VideoRepository videoRepository;
    private ModelMapperConfig modelMapperConfig;

    VideoGraphQlController(CreatorRepository creatorRepository, VideoRepository videoRepository, ModelMapperConfig modelMapperConfig){
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
        this.modelMapperConfig = modelMapperConfig;
    }

    @QueryMapping
    public List<Video> videoList(){
        return videoRepository.findAll();
    }
    @QueryMapping
    public Creator creatorById(@Argument Long id) {
        return creatorRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)));
    }

    @QueryMapping
    public List<Creator> creatorsList(){
        return creatorRepository.findAll();
    }

    @QueryMapping
    public List<Video> creatorVideoList(@Argument Long id){
        Creator c = creatorRepository.findById(id).get();
        List<Video> videos= new ArrayList<>();
        for (Video v: c.getVideos()) {
            videos.add(v);
        }
        return videos;
    }

    @QueryMapping
    public Video videoByName(@Argument String name){
        return videoRepository.findByName(name);
    }

    @QueryMapping
    public Creator creatorByName(@Argument String name){
        return creatorRepository.findByName(name);
    }

    @MutationMapping
    public Creator saveCreator(@Argument CreatorDto creatorDTO){
        System.out.println("Received request to save creator: " + creatorDTO.getName());
        Creator creator = this.modelMapperConfig.fromCreatorDTOtoCreator(creatorDTO);
        System.out.println("Mapped creatorDTO to creator: " + creator);
        Creator savedCreator = creatorRepository.save(creator);
        System.out.println("Saved creator: " + savedCreator);
        return savedCreator;
    }

    @MutationMapping
    public Video saveVideo(@Argument VideoDto videoDTO){
        Creator creator = creatorRepository.findByName(videoDTO.getCreator().getName());
        Video video = this.modelMapperConfig.fromVideoDTOtoVideo(videoDTO);
        video.setCreator(creator);
        return videoRepository.save(video);
    }
    */
}
