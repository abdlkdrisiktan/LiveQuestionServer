package com.mobiversite.live.question.Service;


import com.mobiversite.live.question.Model.Video;
import com.mobiversite.live.question.Repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class VideoService {

    @Autowired
    VideoRepository videoRepository;

    @Autowired
    VideoService videoService;

    public Video sendVideoUrl(int tempValue){
        Video video = videoRepository.findByTempValue(tempValue);
        if (video!=null && video.getTempValue() == 1) {
            System.out.println("sendVideoURL 1. if");
            return video;
        } else {
            if (video.getTempValue() > 1 && video.getStatus().contentEquals("next")) {
                System.out.println("2.if içerği");
                return video;
            }
            System.out.println("sendVideoURL 1. else ");
            return video;
        }
    }

    public void addVideo(String videoURL,int tempValue){
        Video video = new Video();
        String uuid = UUID.randomUUID().toString();
        video.setId(uuid);
        video.setUrl(videoURL);
        video.setTempValue(tempValue);
        video.setStatus("wait");
        videoRepository.save(video);
    }
    public void getNextVideoUrl(int tempValue){
        Video video = videoRepository.findByTempValue(tempValue);
        if(video!=null && video.getStatus().contentEquals("wait")){
            System.out.println("getNextVideoURL");
            video.setStatus("next");
            videoRepository.save(video);
        }
    }
}


 //   List<Video> videoList  = videoRepository.findAll();
//        if (videoList!=null){
//            for (int i =0; i<videoList.size(); i++){
//                if (i==0){
//                    return videoList.get(i).getUrl();
//                }
//                if (i>0 && videoList.get(i).getStatus().contentEquals("next")){
//                    return videoList.get(i).getUrl();
//                }
//            }
//            return "noVideo111";
//        }else {
//            return "noVideo222";
//        }