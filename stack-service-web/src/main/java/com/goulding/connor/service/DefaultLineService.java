package com.goulding.connor.service;

import com.goulding.connor.repository.LineRepository;

/**
 * Created by connor on 14/02/17.
 */
public class DefaultLineService implements LineService {
    private final LineRepository lineRepository;

    public DefaultLineService(final LineRepository lineRepository) {
        this.lineRepository = lineRepository;
    }


}
