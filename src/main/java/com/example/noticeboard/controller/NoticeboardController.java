package com.example.noticeboard.controller;

import com.example.noticeboard.dto.NoticeboardRequestDto;
import com.example.noticeboard.dto.NoticeboardResponseDto;
import com.example.noticeboard.entity.Noticeboard;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class NoticeboardController {

    private final Map<Long, Noticeboard> noticeboardList = new HashMap<>();

    @PostMapping("/boards")
    public NoticeboardResponseDto creatBoard(@RequestBody NoticeboardRequestDto requestDto) {

        Noticeboard noticeboard = new Noticeboard(requestDto);

        Long maxId = noticeboardList.size() > 0 ? Collections.max(noticeboardList.keySet()) + 1 : 1;
        noticeboard.setId(maxId);

        // DB저장
        noticeboardList.put(noticeboard.getId(), noticeboard);

        // Entity -> ResponseDto
        NoticeboardResponseDto noticeboardResponseDto = new NoticeboardResponseDto(noticeboard);

        return noticeboardResponseDto;
    }

    @GetMapping("/boards")
    public List<NoticeboardResponseDto> getNoticeboard() {
        // Map to List
        List<NoticeboardResponseDto> responselist = noticeboardList.values().stream()
                .map(NoticeboardResponseDto::new).toList();

        return  responselist;
    }
}