package com.goulding.connor.repository;

import com.goulding.connor.dao.LineDao;
import com.goulding.connor.domain.Line;
import com.goulding.connor.model.LineDto;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by connor on 14/02/17.
 */
public class PersistedLineRepository implements LineRepository {

    private final LineDao lineDao;
    private final DtoToDomainTransformer dtoToDomainTransformer;
    private final DomainToDtoTransformer domainToDtoTransformer;

    public PersistedLineRepository(final LineDao lineDao, final DtoToDomainTransformer dtoToDomainTransformer,
            final DomainToDtoTransformer domainToDtoTransformer) {
        this.lineDao = lineDao;
        this.dtoToDomainTransformer = dtoToDomainTransformer;
        this.domainToDtoTransformer = domainToDtoTransformer;
    }

    @Override
    public void createLine(LineDto dto) {
        Line line = dtoToDomainTransformer.transform(dto);
        lineDao.addLine(line);
    }

    @Override
    public Collection<LineDto> readLines() {
        return lineDao.readLines().stream().map(domainToDtoTransformer::transform).collect(Collectors.toList());
    }
}
