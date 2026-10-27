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
 * 维度配置信息
 *
 * @author Shine
 * @since 2025/8/20 11:27
 */
@Data
public class DimensionConfig implements Serializable {
    String key;
    String title;
    String category;
    String valueType;
    String unit;
}
