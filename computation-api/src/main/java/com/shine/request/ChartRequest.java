package com.shine.request;

import cn.hutool.core.util.ObjectUtil;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
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
 * 单图表配置
 *
 * @author Shine
 * @since 2025/8/20 10:32
 */
@Data
public class ChartRequest implements Serializable {
    String id;
    BigInteger projectId;
    BigInteger analysisId;
    FilterRequest filters;
    Boolean bookmarkMode = false;
    String chartType;
    Boolean ignoreFilter = false;
    Boolean containsNull = false;
    Integer dataLimit;
    DistributionConfig distribution;
    List<BookmarkConfig> bookmark;
    PartitionConfig partition;
    List<DimensionConfig> dimension;
    List<QuotaConfig> quota;
    List<ChartSortConfig> sort;

    boolean checkRequest() {
        if (ObjectUtil.isNull(projectId) ||  ObjectUtil.isNull(analysisId)) {
            return false;
        }
        return !ObjectUtil.isEmpty(dimension) || !ObjectUtil.isEmpty(quota);
    }
}
