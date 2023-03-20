package edu.miu.eaproject.controllers;

import edu.miu.eaproject.entities.BadgeDTO;
import edu.miu.eaproject.entities.MemberDTO;
import edu.miu.eaproject.repositories.BadgeRepository;
import edu.miu.eaproject.services.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/badges")
public class BadgeController {

    @Autowired
    private BadgeService badgeService;

    @GetMapping
    public ResponseEntity<BadgeDTO> getAllBadges(){
        List<BadgeDTO> badges = badgeService.getAllBadges();
        return new ResponseEntity(badges, HttpStatus.OK);
    }

    @PostMapping("/{memberId}")
    public ResponseEntity<?> save(@PathVariable long memberId){
        BadgeDTO badge = badgeService.createBadge(memberId);
        return new ResponseEntity(badge, HttpStatus.OK);
    }




}