package com.example.thread.multithread.repository;

import com.example.thread.multithread.models.MediaItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaItemDataRepository {

    void save(List<MediaItem> mediaItems);

    List<MediaItem> getLimitedMediaItems(Integer limit);
}
