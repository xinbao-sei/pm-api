package com.donlim.pm.entity;

import com.changhong.sei.core.entity.BaseAuditableEntity;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 提案清单(PmBaseinfo)实体类
 *
 * @author sei
 * @since 2022-08-17 16:29:22
 */
@Entity
@Table(name = "pm_baseinfo")
@DynamicInsert
@DynamicUpdate
@Data
public class PmBaseinfo extends BaseAuditableEntity implements Serializable {
    private static final long serialVersionUID = -51650165192343461L;
    /**
     * 编码
     */
    @Column(name = "code")
    private String code;
    /**
     * 名称
     */
    @Column(name = "name")
    private String name;
    /**
     * 系统名称
     */
    @Column(name = "sys_name")
    private String sysName;
    /**
     * 项目年份
     */
    @Column(name = "year")
    private String year;
    /**
     * 组织编码
     */
    @Column(name = "orgcode")
    private String orgcode;
    /**
     * 组织名称
     */
    @Column(name = "orgname")
    private String orgname;
    /**
     * 组织全称
     */
    @Column(name = "extorgname")
    private String extorgname;
    /**
     * 当前阶段
     */
    @Column(name = "current_period")
    private String currentPeriod;
    /**
     * 主计划达成率
     */
    @Column(name = "master_schedule_rate")
    private String masterScheduleRate;
    /**
     * 开始日期
     */
    @Column(name = "start_date")
    private LocalDate startDate;
    /**
     * 计划结案日期
     */
    @Column(name = "plan_finish_date")
    private LocalDate planFinishDate;
    /**
     * 实际结案日期
     */
    @Column(name = "final_finish_date")
    private LocalDate finalFinishDate;
    /**
     * 日期是否改过
     */
    @Column(name = "date_modified")
    private Boolean dateModified;
    /**
     * 项目天数
     */
    @Column(name = "project_days")
    private Long projectDays;
    /**
     * 是否逾期
     */
    @Column(name = "is_overdue")
    private Boolean isOverdue;
    /**
     * 逾期天数
     */
    @Column(name = "overed_days")
    private Long overedDays;
    /**
     * 是否提前
     */
    @Column(name = "is_advance")
    private Boolean isAdvance;
    /**
     * 逾期天数
     */
    @Column(name = "advance_days")
    private Long advanceDays;
    /**
     * 参与人数
     */
    @Column(name = "attendance_memberr_count")
    private Integer attendanceMemberrCount;
    /**
     * 提案日期
     */
    @Column(name = "submission_date")
    private LocalDate submissionDate;
    /**
     * 规划审批
     */
    @Column(name = "planning_approval")
    private String planningApproval;
    /**
     * 现状描述
     */
    @Column(name = "current_description")
    private String currentDescription;
    /**
     * 需求描述
     */
    @Column(name = "requirement_description")
    private String requirementDescription;
    /**
     * 改善效益
     */
    @Column(name = "improve_benefits")
    private String improveBenefits;
    /**
     * 推广度
     */
    @Column(name = "promotion_degree")
    private String promotionDegree;
    /**
     * 硬件要求
     */
    @Column(name = "hardware_requirement")
    private String hardwareRequirement;
    /**
     * 项目类型
     */
    @Column(name = "project_types")
    private String projectTypes;
    /**
     * 状态
     */
    @Column(name = "status")
    private String status;
    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;
    /**
     * 项目大点节
     */
    @Column(name = "big_node")
    private String bigNode;
    /**
     * 项目小节点
     */
    @Column(name = "small_node")
    private String smallNode;
    /**
     * 需求范围说明书id
     */
    @Column(name = "require_doc_id")
    private String requireDocId;
    /**
     * 验收标准id
     */
    @Column(name = "accept_standard_doc_id")
    private String acceptStandardDocId;
    /**
     * 需求评审
     */
    @Column(name = "require_review")
    private Boolean requireReview;
    /**
     * 启动报告id
     */
    @Column(name = "start_report_doc_id")
    private String startReportDocId;
    /**
     * 用户需求说明书id
     */
    @Column(name = "user_require_doc_id")
    private String userRequireDocId;
    /**
     * 设计图id
     */
    @Column(name = "designer_doc_id")
    private String designerDocId;
    /**
     * 切图id
     */
    @Column(name = "crop_doc_id")
    private String cropDocId;
    /**
     * 测试用例id
     */
    @Column(name = "test_example_doc_id")
    private String testExampleDocId;
    /**
     * 测试报告id
     */
    @Column(name = "test_report_doc_id")
    private String testReportDocId;
    /**
     * SOP
     */
    @Column(name = "sop_doc_id")
    private String sopDocId;
    /**
     * 问题清单id
     */
    @Column(name = "question_list_doc_id")
    private String questionListDocId;
    /**
     * 关健节点点检表id
     */
    @Column(name = "check_list_doc_id")
    private String checkListDocId;
    /**
     * 结案报告id
     */
    @Column(name = "case_close_report_doc_id")
    private String caseCloseReportDocId;
    /**
     * 满意度调查表id
     */
    @Column(name = "satisfaction_survey_doc_id")
    private String satisfactionSurveyDocId;
    /**
     * 页面点检id
     */
    @Column(name = "page_check_doc_id")
    private String pageCheckDocId;
    /**
     * 验收单id
     */
    @Column(name = "accept_order_doc_id")
    private String acceptOrderDocId;
    /**
     * 验收报告id
     */
    @Column(name = "accpet_reprot_doc_id")
    private String accpetReprotDocId;
    /**
     * 租户代码
     */
    @Column(name = "tenant_code")
    private String tenantCode;
    /**
     * UI评审
     */
    @Column(name = "ui_review")
    private Boolean uiReview;
    /**
     * 代码评审
     */
    @Column(name = "code_review")
    private Boolean codeReview;
    /**
     * 前端评审
     */
    @Column(name = "web_review")
    private Boolean webReview;
    /**
     * 后端开发文档id
     */
    @Column(name = "code_dev_doc_id")
    private String codeDevDocId;
    /**
     * 前端开发文档id
     */
    @Column(name = "web_dev_doc_id")
    private String webDevDocId;
    /**
     * 测试结果
     */
    @Column(name = "test")
    private Boolean test;


    /**
     *主导人
     */
    @Column(name = "leader")
    private String leader;
    /**
     * 协助人
     */
    @Column(name = "assist")
    private String assist;
    /**
     *设计人员
     */
    @Column(name = "designer")
    private String  designer;
    /**
     *开发人员
     */
    @Column(name = "developer")
    private String  developer;
    /**
     *实施人员
     */
    @Column(name = "implementer")
    private String implementer;
    /**
     * 流程配置
     */
    @Column(name = "pro_opt_id")
    private String proOptId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pro_opt_id",insertable = false,updatable = false)
    private PmProjectOption pmProjectOption;
    /**
     * 流程配置
     */
    @Column(name = "pro_opt")
    private String proOpt;
    /**
     * 项目成员
     */
    @Column(name = "member")
    private String member;
    /**
     * 本周计划
     */
    @Column(name = "week_plan")
    private String weekPlan;
    /**
     * 下周计划
     */
    @Column(name = "next_week_plan")
    private String nextWeekPlan;
    /**
     * 工作风险
     */
    @Column(name = "work_risk")
    private String workRisk;
    /**
     * 双周计划更新时间
     */
    @Column(name = "week_plan_update")
    private LocalDate weekPlanUpdate;
    /**
     * 是否暂停
     */
    @Column(name = "is_pause")
    private Boolean isPause;
    /**
     * 人天
     */
    @Transient
    private BigDecimal personDay;
}
