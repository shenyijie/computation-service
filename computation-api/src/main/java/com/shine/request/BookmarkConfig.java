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
 * 图表计算书签配置
 *
 * @author Shine
 * @since 2025/8/20 11:09
 */
@Data
public class BookmarkConfig implements Serializable {
    String key;
    String title;
    String type;
    Boolean reverse = false;
}
