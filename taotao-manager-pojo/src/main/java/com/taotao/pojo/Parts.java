package com.taotao.pojo;

public class Parts {
    private Short partId;

    private String partName;

    private String partMail;

    private String partPass;

    public Short getPartId() {
        return partId;
    }

    public void setPartId(Short partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public String getPartMail() {
        return partMail;
    }

    public void setPartMail(String partMail) {
        this.partMail = partMail == null ? null : partMail.trim();
    }

    public String getPartPass() {
        return partPass;
    }

    public void setPartPass(String partPass) {
        this.partPass = partPass == null ? null : partPass.trim();
    }
}