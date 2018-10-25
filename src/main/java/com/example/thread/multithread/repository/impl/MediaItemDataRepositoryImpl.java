package com.example.thread.multithread.repository.impl;

import com.example.thread.multithread.models.MediaItem;
import com.example.thread.multithread.repository.MediaItemDataRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MediaItemDataRepositoryImpl implements MediaItemDataRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void save(List<MediaItem> mediaItems) {
        mediaItems.stream().forEach(mediaItem -> entityManager.persist(mediaItem));
    }

    @Override
    public List<MediaItem> getLimitedMediaItems(Integer limit) {
        return null;
    }
}
