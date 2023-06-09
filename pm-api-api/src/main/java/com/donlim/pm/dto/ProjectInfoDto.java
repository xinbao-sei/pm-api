package com.donlim.pm.dto;

import lombok.Data;

/**
 * @Description:项目统计
 * @Author: chenzhiquan
 * @Date: 2022/9/8.
 */
@Data
public class ProjectInfoDto {
    /**
     * 未开始
     */
    private  Integer notStartedNum;
    /**
     * 进行中
     */
    private Integer processingNum;
    /**
     * 结案
     */
    private Integer finishNum;
    /**
     * 暂停
     */
    private Integer pauseNum;
    /**
     * 总数
     */
    private Integer sumNum;
    /**
     * 提前完成
     */
    private Integer advanceFinishNum;
    /**
     * 逾期项目数
     */
    private Integer overTimeNum;
    /**
     * 即将逾期项目数
     */
    private Integer preOverTimeNum;
    /**
     * 科室人数
     */
    private Integer personNum;
    /**
     * 提前天数
     */
    private long advanceDay;
    /**
     *逾期天数
     */
    private long overTimeDay;



}
