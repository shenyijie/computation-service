package com.shine.service;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.shine.api.ComputationService;
import com.shine.request.ChartsRequest;
import com.shine.response.JSONResponse;
import com.shine.table.entity.ProjectAnalysisEntity;
import com.shine.table.mapper.ProjectAnalysisMapper;
import com.shine.tool.Md5Util;
import com.shine.tool.RedisUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.Objects;

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
 * @since 2025/8/8 10:20
 */
@DubboService
@Slf4j
@Service
@RequiredArgsConstructor
public class ComputationServiceImpl implements ComputationService {
    private final ProjectAnalysisMapper analysisMapper;
    private final RedisUtil redisUtil;

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public JSONObject chartsData(ChartsRequest chartsRequest) {
        log.debug("图表获取请求为：{}", chartsRequest);

        ChartExecutionInfo chartExecutionInfo = new ChartExecutionInfo();
        if (!chartsRequest.checkRequest()) {
            return JSONResponse.fail(JSONUtil.createArray(), "图表输入为空");
        }
        Long analysisId = chartsRequest.getAnalysisId();
        String redisKey = getRedisKey(analysisId, Md5Util.getMd5(chartsRequest));
        if (redisUtil.exists(redisKey)) {
            Object possibleResult = redisUtil.get(redisKey);
            if (ObjectUtil.isNotNull(possibleResult)) {
                return JSONUtil.parseObj(possibleResult);
            }
        }
        ProjectAnalysisEntity projectAnalysisEntity = analysisMapper.getById(analysisId);
        if (Objects.isNull(projectAnalysisEntity)) {
            return JSONResponse.fail(JSONUtil.createArray(), "分析不存在或已被删除");
        }
        chartExecutionInfo.loadInfo(projectAnalysisEntity, chartsRequest);

        return JSONResponse.success(chartsRequest, "计算成功");
    }

    private String getRedisKey(Long analysisId, String md5Code) {
        return StrUtil.format("{}:{}", analysisId, md5Code);
    }
}
