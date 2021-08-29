package com.project.common.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BaseReq {

    @JsonProperty ("id")
    private String id;

    @JsonProperty ("userId")
    private String userId;

    @JsonProperty ("userName")
    private String userName;

    @JsonProperty ("password")
    private String password;

    @JsonProperty ("enable")
    private String enable;

    @JsonProperty ("createdTime")
    private String createdTime;

    @JsonProperty ("referrer")
    private String referrer;

}
