package com.example.noticeboard.entity;

import com.example.noticeboard.dto.NoticeboardRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Noticeboard {
    private Long id;
    private String boardname;
    private String username;
    private String contents;
    private Integer password;
    private Integer date;

    public Noticeboard(NoticeboardRequestDto requestDto) {
        this.boardname = requestDto.getBoardname();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
        this.date = requestDto.getDate();
    }
}
