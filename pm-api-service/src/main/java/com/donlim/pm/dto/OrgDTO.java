package com.donlim.pm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Carol
 * @date 2022/8/11 13:51
 * @description
 */
@NoArgsConstructor
@Data
public class OrgDTO {

    @JsonProperty("code")
    private String code;
    @JsonProperty("data")
    private List<DataDTO> data;
    @JsonProperty("message")
    private String message;

    @NoArgsConstructor
    @Data
    public static class DataDTO {
        @JsonProperty("orgid")
        private Integer orgid;
        @JsonProperty("orgname")
        private String orgname;
        @JsonProperty("code")
        private String code;
        @JsonProperty("extorgname")
        private String extorgname;
        @JsonProperty("usable")
        private Boolean usable;
        @JsonProperty("orgtype")
        private String orgtype;
        @JsonProperty("stat")
        private String stat;
        @JsonProperty("orglevel")
        private Integer orglevel;
        @JsonProperty("idpath")
        private String idpath;
        @JsonProperty("updator")
        private String updator;
        @JsonProperty("updatetime")
        private String updatetime;
        @JsonProperty("superid")
        private Integer superid;
    }
}
