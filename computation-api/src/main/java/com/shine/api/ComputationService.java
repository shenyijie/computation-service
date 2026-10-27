package com.shine.api;

import cn.hutool.json.JSONObject;
import com.shine.request.ChartsRequest;

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
 *
 * @author Shine
 * @since 2025/8/7 14:40
 */
public interface ComputationService {
    String sayHello(String name);

    JSONObject chartsData(ChartsRequest chartsRequest);
}
