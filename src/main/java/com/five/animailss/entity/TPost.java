package com.five.animailss.entity;

import java.util.Date;

public class TPost {
    private Integer pId;

    private String pName;

    private String pPicture;

    private String pInfo;

    private Date pCreatetime;

    private Integer pCount;

    private String pEval;

    private Integer pType;

    private Integer pUid;

    private Integer pState;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpPicture() {
        return pPicture;
    }

    public void setpPicture(String pPicture) {
        this.pPicture = pPicture == null ? null : pPicture.trim();
    }

    public String getpInfo() {
        return pInfo;
    }

    public void setpInfo(String pInfo) {
        this.pInfo = pInfo == null ? null : pInfo.trim();
    }

    public Date getpCreatetime() {
        return pCreatetime;
    }

    public void setpCreatetime(Date pCreatetime) {
        this.pCreatetime = pCreatetime;
    }

    public Integer getpCount() {
        return pCount;
    }

    public void setpCount(Integer pCount) {
        this.pCount = pCount;
    }

    public String getpEval() {
        return pEval;
    }

    public void setpEval(String pEval) {
        this.pEval = pEval == null ? null : pEval.trim();
    }

    public Integer getpType() {
        return pType;
    }

    public void setpType(Integer pType) {
        this.pType = pType;
    }

    public Integer getpUid() {
        return pUid;
    }

    public void setpUid(Integer pUid) {
        this.pUid = pUid;
    }

    public Integer getpState() {
        return pState;
    }

    public void setpState(Integer pState) {
        this.pState = pState;
    }
}