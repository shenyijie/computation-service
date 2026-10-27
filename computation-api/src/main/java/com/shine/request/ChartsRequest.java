package com.shine.request;

import cn.hutool.core.util.ObjectUtil;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

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
 * 整体图表计算结构体（Root）
 *
 * @author Shine
 * @since 2025/8/20 10:21
 */
@Data
public class ChartsRequest implements Serializable {
    FilterRequest filters;
    FilterRequest dashboardFilters;

    List<ChartRequest> charts;
    Boolean exportMode = false;
    Boolean dimensionSearchMode = false;

    ChartRequest firstChart;
    Long analysisId;

    public boolean checkRequest() {
        if (ObjectUtil.isEmpty(charts)) {
            return false;
        }
        for (ChartRequest chartRequest : charts) {
            if (!chartRequest.checkRequest()) {
                return false;
            }
        }
        this.setFirstChart(charts.get(0));
        this.setAnalysisId(this.firstChart.getAnalysisId().longValue());
        return true;
    }
}
