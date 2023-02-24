package com.uno.getinline.controller.api;


import org.springframework.web.bind.annotation.*;


@RequestMapping("/api")
@RestController
public class APIPlaceController {

    @GetMapping("/places")
    public String getPlaces(){
        return "done";
    }

    @PostMapping("/places")
    public String createPlace(){
        return "done";
    }

    @GetMapping("/places/{placeId}")
    public String getPlace(@PathVariable String placeId){
        return "done";
    }

    @PutMapping("/places/{placeId}")
    public String modifyPlace(@PathVariable String placeId){
        return "done";
    }

    @DeleteMapping("/places/{placeId}")
    public String removePlace(@PathVariable String placeId){
        return "done";
    }

}
