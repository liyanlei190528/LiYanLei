package com.example.a41845.liyanlei.bean;

import java.util.List;

public class RootBean {

    /**
     * code : 200
     * message : 成功!
     * result : [{"sid":"29582760","text":"密子君·试吃国内最辣薯片，传说中的国货零食之光！","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2019/0609/5cfd196f0b8c5_wpd.jpg","video":"http://wvideo.spriteapp.cn/video/2019/0609/5cfd196f0b8c5_wpd.mp4","images":null,"up":"87","down":"9","forward":"1","comment":"5","uid":"19637041","name":"密子君","header":"http://wimg.spriteapp.cn/profile/large/2018/06/23/5b2dc5ace8486_mini.jpg","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2019-06-13 02:52:02"},{"sid":"29586622","text":"教育不是注满一桶水，而是点燃一把火！","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2019/0611/46195cec-8c2b-11e9-8180-1866daeb0df1_wpd.jpg","video":"http://wvideo.spriteapp.cn/video/2019/0611/46195cec-8c2b-11e9-8180-1866daeb0df1_wpd.mp4","images":null,"up":"83","down":"3","forward":"2","comment":"1","uid":"20746661","name":"楠木可依","header":"http://wimg.spriteapp.cn/profile/large/2019/03/26/5c99f6da0d0c3_mini.jpg","top_comments_content":"就现在这个教育现状不是靠一两部电影就能改变的，哎任重道远啊\u2026\u2026","top_comments_voiceuri":"","top_comments_uid":"19930375","top_comments_name":"愛丫頭","top_comments_header":"http://qzapp.qlogo.cn/qzapp/100336987/41B6E4B97AB33392C4AB18E004C35481/100","passtime":"2019-06-13 02:12:02"}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * sid : 29582760
         * text : 密子君·试吃国内最辣薯片，传说中的国货零食之光！
         * type : video
         * thumbnail : http://wimg.spriteapp.cn/picture/2019/0609/5cfd196f0b8c5_wpd.jpg
         * video : http://wvideo.spriteapp.cn/video/2019/0609/5cfd196f0b8c5_wpd.mp4
         * images : null
         * up : 87
         * down : 9
         * forward : 1
         * comment : 5
         * uid : 19637041
         * name : 密子君
         * header : http://wimg.spriteapp.cn/profile/large/2018/06/23/5b2dc5ace8486_mini.jpg
         * top_comments_content : null
         * top_comments_voiceuri : null
         * top_comments_uid : null
         * top_comments_name : null
         * top_comments_header : null
         * passtime : 2019-06-13 02:52:02
         */

        private String sid;
        private String text;
        private String type;
        private String thumbnail;
        private String video;
        private Object images;
        private String up;
        private String down;
        private String forward;
        private String comment;
        private String uid;
        private String name;
        private String header;
        private Object top_comments_content;
        private Object top_comments_voiceuri;
        private Object top_comments_uid;
        private Object top_comments_name;
        private Object top_comments_header;
        private String passtime;

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public Object getImages() {
            return images;
        }

        public void setImages(Object images) {
            this.images = images;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getDown() {
            return down;
        }

        public void setDown(String down) {
            this.down = down;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public Object getTop_comments_content() {
            return top_comments_content;
        }

        public void setTop_comments_content(Object top_comments_content) {
            this.top_comments_content = top_comments_content;
        }

        public Object getTop_comments_voiceuri() {
            return top_comments_voiceuri;
        }

        public void setTop_comments_voiceuri(Object top_comments_voiceuri) {
            this.top_comments_voiceuri = top_comments_voiceuri;
        }

        public Object getTop_comments_uid() {
            return top_comments_uid;
        }

        public void setTop_comments_uid(Object top_comments_uid) {
            this.top_comments_uid = top_comments_uid;
        }

        public Object getTop_comments_name() {
            return top_comments_name;
        }

        public void setTop_comments_name(Object top_comments_name) {
            this.top_comments_name = top_comments_name;
        }

        public Object getTop_comments_header() {
            return top_comments_header;
        }

        public void setTop_comments_header(Object top_comments_header) {
            this.top_comments_header = top_comments_header;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }
    }
}
