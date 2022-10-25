package com.mysite.sitebackend.board.news.domain;


import com.mysite.sitebackend.board.coin.domain.CoinBoard;
import com.mysite.sitebackend.board.news.service.NewsBoardService;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Data
@Entity
public class NewsBoardComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String contents; // 내용
    @Column(length = 20)
    private String author; // 작성자명
    @DateTimeFormat(pattern = "YYYYMMDD")
    private String date; // 작성일자
    private Integer boardIndex;
}
