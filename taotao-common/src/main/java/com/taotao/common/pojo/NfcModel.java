package com.taotao.common.pojo;

import java.util.List;

/**
 * Created by Administrator on 2017/1/7.
 */
public class NfcModel {
    /**
     * code : 200是成功0为失败
     * message : 错误消息和成功消息
     * page : 0
     * row : [{"uid":"2","count":"","count_status":"100","status":"0是不用修改，1 为要修改","im":"42312321","material_id":"","material_name":""}]
     * data : {"uid":"2","count_status":"100","im":"42312321","status":"0是不用修改，1 为要修改"}
     */

    private String code;
    private String message;
    private String page;
    private DataBean data;
    private List<RowBean> row;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public List<RowBean> getRow() {
        return row;
    }

    public void setRow(List<RowBean> row) {
        this.row = row;
    }

    public static class DataBean {
        /**
         * uid : 2
         * count_status : 100
         * im : 42312321
         * status : 0是不用修改，1 为要修改
         */

        private String uid;
        private String count_status;
        private String im;
        private String status;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getCount_status() {
            return count_status;
        }

        public void setCount_status(String count_status) {
            this.count_status = count_status;
        }

        public String getIm() {
            return im;
        }

        public void setIm(String im) {
            this.im = im;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public static class RowBean {
        /**
         * uid : 2
         * count :
         * count_status : 100
         * status : 0是不用修改，1 为要修改
         * im : 42312321
         * material_id :
         * material_name :
         */

        private String uid;
        private String count;
        private String count_status;
        private String status;
        private String im;
        private String material_id;
        private String material_name;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getCount_status() {
            return count_status;
        }

        public void setCount_status(String count_status) {
            this.count_status = count_status;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getIm() {
            return im;
        }

        public void setIm(String im) {
            this.im = im;
        }

        public String getMaterial_id() {
            return material_id;
        }

        public void setMaterial_id(String material_id) {
            this.material_id = material_id;
        }

        public String getMaterial_name() {
            return material_name;
        }

        public void setMaterial_name(String material_name) {
            this.material_name = material_name;
        }
    }
}
