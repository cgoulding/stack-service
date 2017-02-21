package com.goulding.connor.rest;

import com.goulding.connor.model.LineDto;
import com.goulding.connor.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by connor on 14/02/17.
 */
@RestController
@RequestMapping(path = "/lines")
public class LineRestController {

    @Autowired
    private LineRepository lineRepository;

    @RequestMapping(method = RequestMethod.GET)
    Collection<LineDto> readLines()
    {
        return lineRepository.readLines();
    }
}
