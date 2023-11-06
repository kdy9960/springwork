package com.example.noticeboard.dto;

import com.example.noticeboard.entity.Noticeboard;
import lombok.Getter;

@Getter
public class NoticeboardResponseDto {
    private Long id;
    private String boardname;
    private String username;
    private String contents;
    private Integer password;
    private Integer date;

    public NoticeboardResponseDto(Noticeboard noticeboard) {
        this.id = noticeboard.getId();
        this.boardname = noticeboard.getBoardname();
        this.username = noticeboard.getContents();
        this.contents = noticeboard.getContents();
        this.password = noticeboard.getPassword();
        this.date = noticeboard.getDate();
    }
}
