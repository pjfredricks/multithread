package com.example.thread.multithread.controller;

import com.example.thread.multithread.models.MediaItem;
import com.example.thread.multithread.service.MediaItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Api
@RestController
@RequestMapping(value = "api/v1")
public class MediaItemController {

    @Autowired
    MediaItemService mediaItemService;

    Date date = new Date();

    @ApiOperation(value = "Reads a CSV file and converts it")
    @PostMapping("/uploadFile")
    ResponseEntity readCsvFile() throws Exception {
        Long startTime = System.currentTimeMillis();
        mediaItemService.saveList(mediaItemService.convertCSVtoJSON());
        Long endTime = System.currentTimeMillis();
        System.out.println("Total time taken: " + Double.valueOf(endTime-startTime)/1000);
        return new ResponseEntity(HttpStatus.OK);
    }
}
