package com.shine.table.mapper;

import com.shine.table.entity.ProjectAnalysisEntity;
import com.mybatisflex.core.BaseMapper;
import com.mybatisflex.core.query.QueryWrapper;

import java.util.Objects;

import static com.shine.table.def.ProjectAnalysisDef.PROJECT_ANALYSIS;

/**
 * Xpros分析配置表 映射层。
 *
 * @author Sky
 * @since 2025-08-21
 */
public interface ProjectAnalysisMapper extends BaseMapper<ProjectAnalysisEntity> {
    default ProjectAnalysisEntity getById(Long id) {
        if (Objects.isNull(id)) {
            return null;
        }
        QueryWrapper queryWrapper = QueryWrapper
                .create()
                .select()
                .where(PROJECT_ANALYSIS.ID.eq(id));
        return selectOneByQuery(queryWrapper);
    }
}
