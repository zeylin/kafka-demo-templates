package com.zeylin.kafkademotemplates.controller;

import com.zeylin.kafkademotemplates.dto.SpaceshipDto;
import com.zeylin.kafkademotemplates.service.SpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spaceships")
public class SpaceshipController {

    private final SpaceshipService spaceshipService;

    @Autowired
    public SpaceshipController(SpaceshipService spaceshipService) {
        this.spaceshipService = spaceshipService;
    }

    @PostMapping
    public void send(@RequestBody SpaceshipDto ship) {
        spaceshipService.send(ship);
    }

}
