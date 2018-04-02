package com.mobiversite.live.question.Repository;

import com.mobiversite.live.question.Model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video,String> {
    Video findByUrl(String videoURL);
    Video findByTempValue(int tempValue);
}
