package com.notebook.com.controller;

import com.notebook.com.model.req.RecordNoteBookReq;
import com.notebook.com.vo.CommonResultVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noteBook")
@Slf4j
@Api("笔记本接口")
public class NoteBookController {



    @RequestMapping("record")
    @ResponseBody
    public CommonResultVo<String> recordNoteBook(@RequestBody RecordNoteBookReq recordNoteBookReq){

        return null;
    }

}
