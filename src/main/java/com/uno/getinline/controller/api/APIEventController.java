package com.uno.getinline.controller.api;


import org.springframework.web.bind.annotation.*;


@RequestMapping("/api")
@RestController
public class APIEventController {

    @GetMapping("/events")
    public String getEvents(){
        return "done";
    }

    @PostMapping("/events")
    public String createEvent(){
        return "done";
    }

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable String eventId){
        return "done";
    }

    @PutMapping("/events/{eventId}")
    public String modifyEvent(@PathVariable String eventId){
        return "done";
    }

    @DeleteMapping("/events/{eventId}")
    public String removeEvent(@PathVariable String eventId){
        return "done";
    }

}
