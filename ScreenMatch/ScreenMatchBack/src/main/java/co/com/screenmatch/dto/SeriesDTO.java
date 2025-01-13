package co.com.screenmatch.dto;

import co.com.screenmatch.model.Category;


public record SeriesDTO(
    String title,
    Integer seasons,
    Double rating,
    String poster,
    Category genre,
    String actors,
    String plot
) { }
