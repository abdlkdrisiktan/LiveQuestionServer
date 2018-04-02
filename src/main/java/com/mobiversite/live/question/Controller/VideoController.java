package com.mobiversite.live.question.Controller;


import com.mobiversite.live.question.Model.Video;
import com.mobiversite.live.question.Service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class VideoController {

    @Autowired
    VideoService videoService;

    @PostMapping(value = "addVideo")
    @ResponseBody
    public void addVideo (@RequestParam(value = "videoURL")String videoURL,@RequestParam(value = "tempValue")int tempValue){
        videoService.addVideo(videoURL,tempValue);
    }

    @GetMapping(value = "getNextVideoUrl")
    @ResponseBody
    public void getNextVideoUrl(@RequestParam(value = "tempValue") int tempValue){
         videoService.getNextVideoUrl(tempValue);
    }

    @GetMapping(value = "sendVideoUrl")
    @ResponseBody
    public Video sendVideoUrl(@RequestParam(value = "tempValue")int tempValue){
        return videoService.sendVideoUrl(tempValue);
    }
}
