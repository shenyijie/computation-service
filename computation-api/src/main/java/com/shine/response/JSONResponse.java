package com.shine.response;

import cn.hutool.json.JSONObject;

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
 * @since 2025/8/21 16:12
 */
public class JSONResponse extends JSONObject{
    public static int ERROR = 500;
    public static int SUCCESS = 200;

    public static String CODE = "code";
    public static String MSG = "msg";
    public static String DATA = "data";

    public static String DEFAULT_SUCCESS = "success";
    public static String DEFAULT_FAIL = "fail";

    public static JSONResponse fail(Object data) {
        return JSONResponse.fail(data, DEFAULT_FAIL);
    }

    public static JSONResponse fail(Object data, String msg) {
        JSONResponse jsonResponse = new JSONResponse();
        jsonResponse.set(CODE, ERROR);
        jsonResponse.set(DATA, data);
        jsonResponse.set(MSG, msg);
        return jsonResponse;
    }

    public JSONResponse msg(String msg) {
        this.set("msg", msg);
        return this;
    }

    public static JSONResponse success(Object data) {
        return JSONResponse.success(data, DEFAULT_SUCCESS);
    }

    public static JSONResponse success(Object data, String msg) {
        JSONResponse jsonResponse = new JSONResponse();
        jsonResponse.set(CODE, SUCCESS);
        jsonResponse.set(DATA, data);
        jsonResponse.set(MSG, msg);
        return jsonResponse;
    }
}
