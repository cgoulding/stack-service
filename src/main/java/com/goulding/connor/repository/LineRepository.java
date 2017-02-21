package com.goulding.connor.repository;

import com.goulding.connor.model.LineDto;

import java.util.Collection;

/**
 * Created by connor on 14/02/17.
 */
public interface LineRepository {

    void createLine(LineDto line);

    Collection<LineDto> readLines();

}
