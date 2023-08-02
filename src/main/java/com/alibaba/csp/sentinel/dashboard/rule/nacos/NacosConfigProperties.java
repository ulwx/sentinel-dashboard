package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sentinel.nacos")
public class NacosConfigProperties {
    // nacos地址
    private String serverAddr="";
    // nacos登录名
    private String username="";
    // nacos 登录密码
    private String password="";
    // nacos命名空间
    private String namespace="";
    private Integer timeOutSecs=5000;
    private String groupId="SENTINEL_GROUP";
    private  String flowDataIdPostfix = "-flow-rules";
    private  String paramFlowDataIdPostfix = "-param-rules";
    private String degradeDataIdPostfix = "-degrade-rules";
    private String sysDataIdPostfix = "-system-rules";
    private   String authDataIdPostfix = "-auth-rules";
    private   String gatewayFlowDataIdPostfix = "-gateway-flow-rules";
    private   String gatewayApiDataIdPostfix = "-gateway-api-rules";

    public Integer getTimeOutSecs() {
        return timeOutSecs;
    }

    public void setTimeOutSecs(Integer timeOutSecs) {
        this.timeOutSecs = timeOutSecs;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getFlowDataIdPostfix() {
        return flowDataIdPostfix;
    }

    public void setFlowDataIdPostfix(String flowDataIdPostfix) {
        this.flowDataIdPostfix = flowDataIdPostfix;
    }

    public String getParamFlowDataIdPostfix() {
        return paramFlowDataIdPostfix;
    }

    public void setParamFlowDataIdPostfix(String paramFlowDataIdPostfix) {
        this.paramFlowDataIdPostfix = paramFlowDataIdPostfix;
    }

    public String getDegradeDataIdPostfix() {
        return degradeDataIdPostfix;
    }

    public void setDegradeDataIdPostfix(String degradeDataIdPostfix) {
        this.degradeDataIdPostfix = degradeDataIdPostfix;
    }

    public String getSysDataIdPostfix() {
        return sysDataIdPostfix;
    }

    public void setSysDataIdPostfix(String sysDataIdPostfix) {
        this.sysDataIdPostfix = sysDataIdPostfix;
    }

    public String getAuthDataIdPostfix() {
        return authDataIdPostfix;
    }

    public void setAuthDataIdPostfix(String authDataIdPostfix) {
        this.authDataIdPostfix = authDataIdPostfix;
    }

    public String getGatewayFlowDataIdPostfix() {
        return gatewayFlowDataIdPostfix;
    }

    public void setGatewayFlowDataIdPostfix(String gatewayFlowDataIdPostfix) {
        this.gatewayFlowDataIdPostfix = gatewayFlowDataIdPostfix;
    }

    public String getGatewayApiDataIdPostfix() {
        return gatewayApiDataIdPostfix;
    }

    public void setGatewayApiDataIdPostfix(String gatewayApiDataIdPostfix) {
        this.gatewayApiDataIdPostfix = gatewayApiDataIdPostfix;
    }

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}

