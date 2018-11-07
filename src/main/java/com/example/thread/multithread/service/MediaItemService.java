package com.example.thread.multithread.service;

import org.json.JSONArray;

public interface MediaItemService {

    JSONArray convertCSVtoJSON() throws Exception;

    void saveList(JSONArray array) throws Exception;
}
