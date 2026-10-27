package com.shine.request;

import lombok.Data;

import java.io.Serializable;

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
 * 图表指标对比配置信息
 *
 * @author Shine
 * @since 2025/8/20 11:09
 */
@Data
public class QuotaCompareConfig implements Serializable {
    String id;
    String type;
    String result;
    String column;
    String unit;
    Long targetTimeStart;
    Long targetTimeEnd;
    Long compareTimeStart;
    Long compareTimeEnd;
}
