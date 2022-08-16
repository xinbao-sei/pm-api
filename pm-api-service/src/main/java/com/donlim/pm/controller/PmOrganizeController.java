package com.donlim.pm.controller;

import com.changhong.sei.core.controller.BaseTreeController;
import com.changhong.sei.core.dto.ResultData;
import com.changhong.sei.core.dto.serach.PageResult;
import com.changhong.sei.core.dto.serach.Search;
import com.changhong.sei.core.service.BaseTreeService;
import com.donlim.pm.api.PmOrganizeApi;
import com.donlim.pm.dto.PmOrganizeDto;
import com.donlim.pm.entity.PmOrganize;
import com.donlim.pm.service.PmOrganizeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * (PmOrganize)控制类
 *
 * @author sei
 * @since 2022-08-11 14:05:49
 */
@RestController
@Api(value = "PmOrganizeApi", tags = "服务")
@RequestMapping(path = PmOrganizeApi.PATH, produces = MediaType.APPLICATION_JSON_VALUE)
public class PmOrganizeController extends BaseTreeController<PmOrganize, PmOrganizeDto> implements PmOrganizeApi {
    /**
     * 服务对象
     */
    @Autowired
    private PmOrganizeService service;

    @Override
    public BaseTreeService<PmOrganize> getService() {
        return service;
    }

    @Override
    public ResultData<PageResult<PmOrganizeDto>> findByPage(Search search) {
        return convertToDtoPageResult(service.findByPage(search));
    }

    @Override
    public ResultData<PmOrganizeDto> findTree() {
        return ResultData.success(convertToDto(service.findTree()));
    }
}
