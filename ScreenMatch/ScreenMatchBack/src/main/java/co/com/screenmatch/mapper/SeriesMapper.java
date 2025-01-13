package co.com.screenmatch.mapper;

import co.com.screenmatch.dto.SeriesDTO;
import co.com.screenmatch.model.Series;

import java.util.List;
import java.util.stream.Collectors;


public class SeriesMapper {
    public static SeriesDTO toSeriesDTO(Series series) {
        return new SeriesDTO(
                series.getTitle(),
                series.getSeasons(),
                series.getRating(),
                series.getPoster(),
                series.getGenre(),
                series.getActors(),
                series.getPlot()
        );
    }

    public static List<SeriesDTO> toSeriesDTOList(List<Series> seriesList) {
        return seriesList.stream().map(SeriesMapper::toSeriesDTO).collect(Collectors.toList());
    }
}
