package top.xie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xie.response.ResponseResult;

/**
 * 错误码转统一返回的结果
 */

@RestController
public class ErrorPageController {
    @GetMapping("/404")
    public ResponseResult page404(){
        return ResponseResult.ERROR_404();
    }

    @RequestMapping("/403")
    public ResponseResult page403(){
        return ResponseResult.ERROR_403();
    }
    @GetMapping("/504")
    public ResponseResult page504(){
        return ResponseResult.ERROR_504();
    }
    @GetMapping("/505")
    public ResponseResult page505(){
        return ResponseResult.ERROR_505();
    }
}
