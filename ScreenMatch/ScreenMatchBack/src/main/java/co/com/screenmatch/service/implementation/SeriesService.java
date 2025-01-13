package co.com.screenmatch.service.implementation;

import co.com.screenmatch.dto.SeriesDTO;
import co.com.screenmatch.mapper.SeriesMapper;
import co.com.screenmatch.repository.SeriesRepository;
import co.com.screenmatch.service.ISeriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class SeriesService implements ISeriesService {
    private final SeriesRepository seriesRepository;

    @Override
    public List<SeriesDTO> findAll() {
        return SeriesMapper.toSeriesDTOList(seriesRepository.findAll());
    }
}
