package com.donlim.pm.controller;

import com.alibaba.fastjson.JSONObject;
import com.changhong.sei.basic.api.UserApi;
import com.changhong.sei.basic.dto.FeatureRoleDto;
import com.changhong.sei.core.dto.ResultData;
import com.changhong.sei.core.test.BaseUnitTest;
import com.donlim.pm.connector.IppConnector;
import com.donlim.pm.dto.IppProjectInfoDetails;
import com.donlim.pm.em.LogType;
import com.donlim.pm.em.SmallNodeType;
import com.donlim.pm.service.PmBaseinfoService;
import com.donlim.pm.util.EnumUtils;
import com.donlim.pm.webservice.eip.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * 实现功能: Hello 单元测试
 */
public class HelloControllerTest extends BaseUnitTest {
    @Autowired
    private HelloController controller;
    @Autowired
    private PmBaseinfoService pmBaseinfoService;
    @Autowired
    private  PmBaseinfoController pmBaseinfoController;
    @Autowired
    private UserApi userApi;
    @Test
    public void sayHello() {


        ResultData<List<FeatureRoleDto>> featureRolesByAccount = userApi.getFeatureRolesByAccount("admin");
        if (featureRolesByAccount.getSuccess()) {
            for(FeatureRoleDto roleDto:featureRolesByAccount.getData()){
                System.out.println(roleDto);
            }


        }
      //  pmBaseinfoController.syncProjectInfo("E20220808002");
       // System.out.println( EnumUtils.getEnumItemRemark(LogType.class,LogType.ModifyCodePlan));
       /* String name = "程序员";
        ResultData<String> result = controller.sayHello(name);
        LOG.debug(JsonUtils.toJson(result));*/

  /*      HashMap<String,String> map=new HashMap<>();
        map.put("mm","aa");
        map.put("bb","kk");
        String aa =JSONObject.toJSONString(map);
        System.out.println(aa);*/
       // System.out.println(SmallNodeType.Start.name()); ;
      //  System.out.println(EnumUtils.getEnumItemRemark(SmallNodeType.class,SmallNodeType.Research));

      //  pmBaseinfoService.updateProjectInfo();
      //  APPHDR appHdr=new APPHDR();

       /* APPBODY appBody=new APPBODY();
        appBody.setPROJECTNO("E20211222011");
        SVCHDR svcHdr=new SVCHDR();
        ObjectFactory objectFactory=new ObjectFactory();
        CheckSearchSevice checkSearchSevice=new CheckSearchSevice();
        SVCBODYS svcbodys = checkSearchSevice.getDomino().synchecksearch(svcHdr, appHdr, appBody);
        if("S".equals(svcbodys.getOSVCHDRS().getRCODE())) {
            if (svcbodys.getOAPPBODYS().isRESULT()) {

            }
        }*/
     // IppConnector.getTestResult("E20211008003");
    }
}
