package com.example.thread.multithread.repository;

import com.example.thread.multithread.models.MediaItem;

import java.util.List;

public interface MediaItemDataRepository {

    void save(List<MediaItem> mediaItems);

    List<MediaItem> getLimitedMediaItems(Integer limit);
}
