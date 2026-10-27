package com.shine.tool;

import cn.hutool.core.util.StrUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

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
 * @since 2025/8/22 11:43
 */
@Component
@RequiredArgsConstructor
public class RedisUtil {
    private final RedisTemplate<String, Object> redisTemplate;

    public boolean exists(String key) {
        return redisTemplate.hasKey(key);
    }

    public Object get(String key) {
        if (StrUtil.isBlank(key)) {
            return null;
        } else if (!exists(key)) {
            return null;
        } else {
            return redisTemplate.opsForValue().get(key);
        }
    }

    public void set(String key, Object value) {
        if (StrUtil.isNotBlank(key)) {
            redisTemplate.opsForValue().set(key, value);
        }
    }
}
