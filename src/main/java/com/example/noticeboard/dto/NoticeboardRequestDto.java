package com.example.noticeboard.dto;

import lombok.Getter;

@Getter
public class NoticeboardRequestDto {
    private String boardname;
    private String username;
    private String contents;
    private Integer password;
    private Integer date;
}
