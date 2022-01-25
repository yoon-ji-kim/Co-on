package com.ssafy.api.response;

import com.ssafy.db.entity.Notice;
import com.ssafy.db.entity.Student;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@ApiModel("NoticeResponse")
public class NoticeFindID {
    @ApiModelProperty(name="Notice ID")
    int noticeId;
    @ApiModelProperty(name = "클래스 ID", example = "1")
    int studyId;
    @ApiModelProperty(name="tchr ID")
    String tchrId;
    @ApiModelProperty(name="Notice Title")
    String noticeTitle;
    @ApiModelProperty(name="Notice content")
    String noticeContent;
    @ApiModelProperty(name="Notice Posted")
    String noticePosted;
    public static NoticeFindID of(Notice notice){
        NoticeFindID res = new NoticeFindID();
        res.setNoticeId(notice.getNoticeId());
        res.setStudyId(notice.getStudyId());
        res.setNoticeTitle(notice.getNoticeTitle());
        res.setTchrId(notice.getTchrId());
        res.setNoticeContent(notice.getNoticeContent());
        res.setNoticePosted(String.valueOf(notice.getNoticePosted()));
        return res;
    }
}