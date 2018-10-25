package com.example.thread.multithread.service;

import com.example.thread.multithread.models.MediaItem;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.concurrent.Future;

public interface MediaItemService {

    JSONArray convertCSVtoJSON() throws Exception;

    void saveList(JSONArray array) throws Exception;
}
