package com.goulding.connor.repository;

import com.goulding.connor.domain.Line;
import com.goulding.connor.model.LineDto;

/**
 * Created by root on 21/02/17.
 */
public class DomainToDtoTransformer {
    public LineDto transform(final Line line) {
        return new LineDto(line.getNumber1(), line.getNumber2(), line.getNumber3());
    }
}
