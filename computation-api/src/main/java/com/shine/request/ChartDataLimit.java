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
 * 图表结果限制配置
 *
 * @author Shine
 * @since 2025/8/20 11:04
 */
@Data
public class ChartDataLimit implements Serializable {
    String mode;
    Integer num;
    Integer start;
    Integer end;
}
