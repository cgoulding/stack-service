package com.goulding.connor.repository;

import com.goulding.connor.domain.Line;
import com.goulding.connor.model.LineDto;

import java.util.UUID;

/**
 * Created by connor on 14/02/17.
 */
public class DtoToDomainTransformer {

    public Line transform(LineDto dto)
    {
        return new Line(UUID.randomUUID().timestamp(), dto.getNumber1(), dto.getNumber2(), dto.getNumber3());
    }
}
