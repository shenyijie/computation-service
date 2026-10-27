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
 * 直方图配置传参
 *
 * @author Shine
 * @since 2025/8/20 11:09
 */
@Data
public class DistributionConfig implements Serializable {
    String distributionType;
    Integer num;
    List<Integer> sectionList;
    Boolean isShowMax = false;
    Boolean isShowMin = false;
    String timeType;
}
