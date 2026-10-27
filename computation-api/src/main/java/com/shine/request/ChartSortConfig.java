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
 * 图表排序配置
 *
 * @author Shine
 * @since 2025/8/20 11:09
 */
@Data
public class ChartSortConfig implements Serializable {
    String id;
    String title;
    String category;
    String type;
    String valueType;
    String mode;
    List<String> top;
    List<String> bottom;
}
