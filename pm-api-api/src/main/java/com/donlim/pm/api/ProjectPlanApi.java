package com.donlim.pm.api;

import com.changhong.sei.core.api.BaseEntityApi;
import com.changhong.sei.core.api.FindByPageApi;
import com.changhong.sei.core.dto.ResultData;
import com.changhong.sei.core.dto.serach.Search;
import com.donlim.pm.dto.ProjectPlanDto;
import com.donlim.pm.dto.excel.ProjectPlanExcelDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * 项目计划表(ProjectPlan)API
 *
 * @author sei
 * @since 2022-08-18 16:41:31
 * TODO @FeignClient(name = "请修改为项目服务名")
 */
@Valid
@FeignClient(name = "pm-api", path = ProjectPlanApi.PATH)
public interface ProjectPlanApi extends BaseEntityApi<ProjectPlanDto>, FindByPageApi<ProjectPlanDto> {
    String PATH = "projectPlan";

    /**
     * 批量保存
     * @param
     */
    @PostMapping(path = "saveBatch",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "项目计划批量保存" ,notes = "项目计划批量保存")
    ResultData<String> saveBatch(@RequestBody List<ProjectPlanDto> projectPlanDtos);

    @PostMapping(path = "uploadMasterPlan")
    @ApiOperation(value = "导入计划",notes = "导入计划")
    ResultData<String> uploadMasterPlan(@RequestBody List<ProjectPlanDto> list) throws Exception;

    /**
     * 计划表导出excel
     * @param search 查询条件
     */
    @PostMapping(path = "export",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "计划表导出excel" ,notes = "计划表导出excel")
    ResultData<List<ProjectPlanExcelDto>> export(@RequestBody Search search);
}
