package com.goulding.connor.stack.service;

import com.goulding.connor.stack.service.model.LineDto;

import java.util.Collection;

/**
 * Created by root on 20/02/17.
 */
public interface LineService {
    Collection<LineDto> readLines();

    void createLine(LineDto line);
}
