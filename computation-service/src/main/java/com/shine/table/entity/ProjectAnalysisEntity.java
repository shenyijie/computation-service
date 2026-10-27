package com.shine.table.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * Xpros分析配置表 实体类。
 *
 * @author Sky
 * @since 2025-08-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("xp_project_analysis")
public class ProjectAnalysisEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 公司ID
     */
    private Long companyId;

    /**
     * 项目ID
     */
    private Long projectId;

    /**
     * 项目排序，值越小越靠后
     */
    private Integer sort;

    /**
     * 分析名称
     */
    private String analysisName;

    /**
     * 分析图片
     */
    private String analysisImg;

    /**
     * 创建进度0-100
     */
    private Integer createProgress;

    /**
     * 创建结果
     */
    private String createResult;

    /**
     * 分析的head数据
     */
    private String headJsonList;

    /**
     * 工作日、节假日、补班信息
     */
    private String workCycleJson;

    /**
     * 创建人ID
     */
    private Long creatorId;

    /**
     * 创建人
     */
    private String creatorName;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新人ID
     */
    private Long updaterId;

    /**
     * 更新人
     */
    private String updaterName;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 是否软删除
     */
    private Boolean deleted;

    /**
     * 状态
     */
    private Boolean enabled;

    /**
     * 乐观锁
     */
    private Integer opsLock;

    /**
     * 数据备注
     */
    private String remark;

    /**
     * 是否有更新:false没更新，true有更新
     */
    private Boolean dataUpdate;

    /**
     * 分析集模版ID
     */
    private Long analysisTemplateId;

    /**
     * 分析数据最后更新完成时间
     */
    private Long dataUpdateTime;

    /**
     * 数据状态
     */
    private Integer dataStatus;

    /**
     * 数据自动更新,false 手动更新，true自动更新
     */
    private Boolean dataAutomaticUpdate;

    /**
     * 分析是否可用，true可用，false不可用
     */
    private Boolean analysisAvailable;

    /**
     * 工作周期更新时间
     */
    private Long workCycleUpdateTime;

}
