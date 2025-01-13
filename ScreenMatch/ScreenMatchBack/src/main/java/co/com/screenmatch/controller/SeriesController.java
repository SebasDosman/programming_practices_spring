package co.com.screenmatch.controller;

import co.com.screenmatch.dto.SeriesDTO;
import co.com.screenmatch.service.ISeriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/series")
@RequiredArgsConstructor
@RestController
public class SeriesController {
    private final ISeriesService seriesService;

    @GetMapping()
    public ResponseEntity<List<SeriesDTO>> findAll() {
        return new ResponseEntity<>(seriesService.findAll(), HttpStatus.OK);
    }
}
