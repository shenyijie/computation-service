package com.shine.request;

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
 * 指标配置
 *
 * @author Shine
 * @since 2025/8/20 11:09
 */
@Data
public class QuotaConfig implements Serializable {
    String id;
    String key;
    String title;
    String category;
    String valueType;
    String unit;
    String aggregate;
    List<PositionLineConfig> positionLine;
    List<QuotaCompareConfig> children;
}
