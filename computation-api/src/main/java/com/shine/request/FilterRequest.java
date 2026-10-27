package com.shine.request;

import cn.hutool.json.JSONArray;
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
 * 过滤配置
 *
 * @author Shine
 * @since 2025/8/20 10:53
 */
@Data
public class FilterRequest implements Serializable {
    String relationship;
    JSONArray data;
}
