package com.goulding.connor.stack.service;

import com.goulding.connor.stack.service.model.LineDto;
import com.goulding.connor.stack.service.repository.LineRepository;

import java.util.Collection;

/**
 * Created by connor on 14/02/17.
 */
public class DefaultLineService implements LineService {
    private final LineRepository lineRepository;

    public DefaultLineService(final LineRepository lineRepository) {
        this.lineRepository = lineRepository;
    }

    @Override
    public Collection<LineDto> readLines()
    {
        return lineRepository.readLines();
    }

    @Override
    public void createLine(LineDto line)
    {
        lineRepository.createLine(line);
    }
}
