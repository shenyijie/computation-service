package com.shine.service;

import com.shine.request.ChartsRequest;
import com.shine.table.entity.ProjectAnalysisEntity;
import lombok.Data;

/**
 * ━━━━━━━━━佛祖保佑━━━━━━━━━━━
 *                  ,;,,;
 *                ,;;' (    社
 *      ___      ,;;' ' \   会
 *    /'  '\'~~'~' \ /'\.)  主
 * ,;(      )     /  |.     义
 *,;' \    /-.,,(   ) \     码
 *     ) /       ) / )|     农
 *     ||        ||  \\
 *    (_\       (_\  (_\
 * ━━━━━━━━━永无BUG━━━━━━━━━━━━
 * 图表计算整理计算输入信息
 *
 * @author Shine
 * @since 2025/8/21 11:11
 */
@Data
public class ChartExecutionInfo {
    Long companyId;
    Long projectId;
    Long analysisId;


    void loadInfo(ProjectAnalysisEntity projectAnalysis, ChartsRequest chartsRequest) {
        this.setCompanyId(projectAnalysis.getCompanyId());
        this.setProjectId(projectAnalysis.getProjectId());
        this.setAnalysisId(projectAnalysis.getId());

        return;
    }
}
