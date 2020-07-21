package com.spring.mvc.demo.controller;

import com.spring.mvc.demo.beans.UserBean;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/test01")
    @ResponseBody
    public String test01() {
        return "hello world";
    }


    @RequestMapping("/toIndex")
    public String toIndex() {
        System.out.println("toIndex");
        return "forward:/index.jsp";
    }

    @RequestMapping("/redirect")
    public String redirect() {
        return "redirect:https://www.baidu.com";
    }

    @RequestMapping("/forward")
    public String forward() {
        return "forward:/error.jsp";
    }

    @RequestMapping("/rest/{id}")
    @ResponseBody
    public String restful(@PathVariable("id") int id) {
        System.out.println("id = " + id);
        return "id == " + id;
    }


    @GetMapping("/pattern/1/index?")
    @ResponseBody
    public String pattern1(HttpServletRequest request) {
        return request.getRequestURI();
    }

    @GetMapping("/pattern/2/*.png/")
    @ResponseBody
    public String pattern2(HttpServletRequest request) {
        return request.getRequestURI();
    }

    @GetMapping("/pattern/resource/**")
    @ResponseBody
    public String pattern3(HttpServletRequest request) {
        return request.getRequestURI();
    }

    @GetMapping("/pattern/4/{id}")
    @ResponseBody
    public String pattern4(HttpServletRequest request, @PathVariable("id") int id) {
        return request.getRequestURI();
    }


    @GetMapping("/pattern/{name:[a-zA-Z0-9]}{ext:\\.[a-zA-Z]+}/aaa")
    @ResponseBody
    public String pattern5(HttpServletRequest request, @PathVariable("name") String name, @PathVariable("ext") String ext) {
        System.out.println("fileName = " + name);
        System.out.println("file ext = " + ext);
        return request.getRequestURI();
    }

    @RequestMapping("/req")
    public void requestParam(@RequestParam("q") String q) {
        System.out.println("q = " + q);
    }

    @RequestMapping("/req/header")
    public void requestHeader(@RequestHeader("Host") String host) {
        System.out.println("Host = " + host);
    }

    @RequestMapping("/req/cookie")
    public void requestCookie(@CookieValue("JSESESSIONID") String sessionId) {
        System.out.println("sessionId = " + sessionId);
    }

    // ModelAttribute


    /**
     * 设置一个session值
     * @param session
     */
    @RequestMapping("/sessionAttribute")
    public void setSessionAttribute(HttpSession session) {
        session.setAttribute("key","hello");
    }

    /**
     * 将session值取出，session值可以是任意类型
     * @param value
     */
    @RequestMapping("getSessionAttribute")
    public void sessionAttribute(@SessionAttribute("key") String value){
        System.out.println("session attribute key = " + value);
    }

    @RequestMapping("/requestBody")
    public void requestBody(@RequestBody UserBean userBean) throws IOException {
        throw new IOException("io exception");
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping("exp")
    public void exception() throws IOException{
        throw new IOException("io exception");
    }

    @RequestMapping("notFoundExp")
    public void notFoundExp() throws ClassNotFoundException {
        throw new ClassNotFoundException("io exception");
    }


    /**
     * 当出现IOExcetion异常时，会调用一下方法井下响应数据
     * @param ex
     * @return
     */
    @ExceptionHandler
    public ResponseEntity<String> exceptionHandler(IOException ex){
        System.out.println("IOException");

        return ResponseEntity.of(Optional.of("错误"));
    }

    @ExceptionHandler
    public ResponseEntity<String> exceptionHandler(ClassNotFoundException ex){
        System.out.println("ClassNotFoundException");
        return ResponseEntity.of(Optional.of("错误"));
    }
}
