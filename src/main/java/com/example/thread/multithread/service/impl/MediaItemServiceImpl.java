package com.example.thread.multithread.service.impl;

import com.example.thread.multithread.models.MediaItem;
import com.example.thread.multithread.repository.MediaItemDataRepository;
import com.example.thread.multithread.service.MediaItemService;
import com.example.thread.multithread.utils.CSV;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class MediaItemServiceImpl implements MediaItemService {

    @Autowired
    MediaItemDataRepository mediaItemDataRepository;

    @Value("${sampledata.majestic.million.csv}")
    String multipartFile;

    ObjectMapper mapper = new ObjectMapper();

    //TODO: Read line by line and map it.

    @Override
    public JSONArray convertCSVtoJSON() throws Exception {
        List<Map<String, String>> list = new ArrayList<>();

        File file = new File(multipartFile);
        Long startTime = System.currentTimeMillis();
        try (InputStream in = new FileInputStream(file.toString())) {
            CSV csv = new CSV(true, ',', in);
            List<String> fieldNames = null;
            if (csv.hasNext()) fieldNames = new ArrayList<>(csv.next());
            while (csv.hasNext()) {
                List<String> x = csv.next();
                Map<String, String> obj = new LinkedHashMap<>();
                for (int i = 0; i < fieldNames.size(); i++) {
                    obj.put(fieldNames.get(i), x.get(i));
                }
                list.add(obj);
            }
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
        }

        JSONArray array = new JSONArray(list);
        Long endTime = System.currentTimeMillis();
        System.out.println("CSV to JSON time: " + Double.valueOf(endTime-startTime)/1000);
        return array;
    }

    @Override
    public void saveList(JSONArray array) throws Exception {
        mediaItemDataRepository.save(convertJSONArrayToList(array));
    }

    public List<MediaItem> convertJSONArrayToList(JSONArray array) throws IOException {
        List<MediaItem> mediaItems = new ArrayList<>();
        Long startTime = System.currentTimeMillis();
        if (!array.toList().isEmpty()) {
            for (int i = 0; i < array.length(); i++) {
                mediaItems.add(mapper.readValue(array.get(i).toString(), MediaItem.class));
            }
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Convert JSON Array to List: " + Double.valueOf(endTime-startTime)/1000);
        return mediaItems;
    }


}
