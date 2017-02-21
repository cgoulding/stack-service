package com.goulding.connor.dao;

import com.goulding.connor.domain.Line;

import java.util.List;

/**
 * Created by connor on 14/02/17.
 */
public interface LineDao {
    void addLine(Line line);

    List<Line> readLines();
}
