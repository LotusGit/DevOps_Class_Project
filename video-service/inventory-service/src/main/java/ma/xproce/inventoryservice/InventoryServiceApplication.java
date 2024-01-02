package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.dao.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository){
        return args->{
            creatorRepository.save(Creator.builder().name("yassine").email("yassine.mchimech@gmail.com").build());
            creatorRepository.save(Creator.builder().name("El Hachmy").email("Bel.ElHachmy@gmail.com").build());
            Creator creator1 = creatorRepository.findById(Long.valueOf(1)).get();
            Creator creator2 = creatorRepository.findById(Long.valueOf(2)).get();
            videoRepository.save(Video.builder().name("First Video").url("0.0.0.1:8086").description("video number One").datePublication(new Date()).creator(creator1).build());
            videoRepository.save(Video.builder().name("nihahahaha").url("0.0.1.0:8086").description("video number Two").datePublication(new Date()).creator(creator1).build());
            videoRepository.save(Video.builder().name("Shinedeiru").url("0.0.1.1:8086").description("First Video").datePublication(new Date()).creator(creator2).build());
        };
    }
}
