package co.com.screenmatch.service;

import co.com.screenmatch.dto.SeriesDTO;

import java.util.List;


public interface ISeriesService {
    List<SeriesDTO> findAll();
}
