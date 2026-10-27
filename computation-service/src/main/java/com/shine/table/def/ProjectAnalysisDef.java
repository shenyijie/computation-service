package com.shine.table.def;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

import java.io.Serial;

/**
 * Xpros分析配置表 表定义层。
 *
 * @author Sky
 * @since 2025-08-21
 */
public class ProjectAnalysisDef extends TableDef {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Xpros分析配置表
     */
    public static final ProjectAnalysisDef PROJECT_ANALYSIS = new ProjectAnalysisDef();

    /**
     * 主键
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 项目排序，值越小越靠后
     */
    public final QueryColumn SORT = new QueryColumn(this, "sort");

    /**
     * 数据备注
     */
    public final QueryColumn REMARK = new QueryColumn(this, "remark");

    /**
     * 是否软删除
     */
    public final QueryColumn DELETED = new QueryColumn(this, "deleted");

    /**
     * 状态
     */
    public final QueryColumn ENABLED = new QueryColumn(this, "enabled");

    /**
     * 乐观锁
     */
    public final QueryColumn OPS_LOCK = new QueryColumn(this, "ops_lock");

    /**
     * 公司ID
     */
    public final QueryColumn COMPANY_ID = new QueryColumn(this, "company_id");

    /**
     * 创建人ID
     */
    public final QueryColumn CREATOR_ID = new QueryColumn(this, "creator_id");

    /**
     * 项目ID
     */
    public final QueryColumn PROJECT_ID = new QueryColumn(this, "project_id");

    /**
     * 更新人ID
     */
    public final QueryColumn UPDATER_ID = new QueryColumn(this, "updater_id");

    /**
     * 创建时间
     */
    public final QueryColumn CREATE_TIME = new QueryColumn(this, "create_time");

    /**
     * 数据状态
     */
    public final QueryColumn DATA_STATUS = new QueryColumn(this, "data_status");

    /**
     * 是否有更新:false没更新，true有更新
     */
    public final QueryColumn DATA_UPDATE = new QueryColumn(this, "data_update");

    /**
     * 更新时间
     */
    public final QueryColumn UPDATE_TIME = new QueryColumn(this, "update_time");

    /**
     * 分析图片
     */
    public final QueryColumn ANALYSIS_IMG = new QueryColumn(this, "analysis_img");

    /**
     * 创建人
     */
    public final QueryColumn CREATOR_NAME = new QueryColumn(this, "creator_name");

    /**
     * 更新人
     */
    public final QueryColumn UPDATER_NAME = new QueryColumn(this, "updater_name");

    /**
     * 分析名称
     */
    public final QueryColumn ANALYSIS_NAME = new QueryColumn(this, "analysis_name");

    /**
     * 创建结果
     */
    public final QueryColumn CREATE_RESULT = new QueryColumn(this, "create_result");

    /**
     * 分析的head数据
     */
    public final QueryColumn HEAD_JSON_LIST = new QueryColumn(this, "head_json_list");

    /**
     * 工作日、节假日、补班信息
     */
    public final QueryColumn WORK_CYCLE_JSON = new QueryColumn(this, "work_cycle_json");

    /**
     * 创建进度0-100
     */
    public final QueryColumn CREATE_PROGRESS = new QueryColumn(this, "create_progress");

    /**
     * 分析数据最后更新完成时间
     */
    public final QueryColumn DATA_UPDATE_TIME = new QueryColumn(this, "data_update_time");

    /**
     * 分析是否可用，true可用，false不可用
     */
    public final QueryColumn ANALYSIS_AVAILABLE = new QueryColumn(this, "analysis_available");

    /**
     * 分析集模版ID
     */
    public final QueryColumn ANALYSIS_TEMPLATE_ID = new QueryColumn(this, "analysis_template_id");

    /**
     * 数据自动更新,false 手动更新，true自动更新
     */
    public final QueryColumn DATA_AUTOMATIC_UPDATE = new QueryColumn(this, "data_automatic_update");

    /**
     * 工作周期更新时间
     */
    public final QueryColumn WORK_CYCLE_UPDATE_TIME = new QueryColumn(this, "work_cycle_update_time");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, COMPANY_ID, PROJECT_ID, SORT, ANALYSIS_NAME, ANALYSIS_IMG, CREATE_PROGRESS, CREATE_RESULT, HEAD_JSON_LIST, WORK_CYCLE_JSON, CREATOR_ID, CREATOR_NAME, CREATE_TIME, UPDATER_ID, UPDATER_NAME, UPDATE_TIME, DELETED, ENABLED, OPS_LOCK, REMARK, DATA_UPDATE, ANALYSIS_TEMPLATE_ID, DATA_UPDATE_TIME, DATA_STATUS, DATA_AUTOMATIC_UPDATE, ANALYSIS_AVAILABLE, WORK_CYCLE_UPDATE_TIME};

    public ProjectAnalysisDef() {
        super("", "xp_project_analysis");
    }

    private ProjectAnalysisDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public ProjectAnalysisDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new ProjectAnalysisDef("", "xp_project_analysis", alias));
    }

}
