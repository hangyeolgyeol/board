package com.btistudy.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/*  엑셀 api 순서대로
     /articles	                GET	게시판 페이지
     /articles/{article-id}	    GET	게시글(상세)페이지
     /articles/search	        GET	게시판 검색 전용 페이지
     /articles/search-hashtag	GET	게시판 해시태그 검색 전용 페이지
 */

@Controller
@RequestMapping("/articles")
public class Ex06_1_ArticleController {


    public String article(ModelMap model) {
        /* ModelMap 쓰는 이유:  */
        
        model.addAttribute("articles", List.of());
        return "articles/index";
    }
}
