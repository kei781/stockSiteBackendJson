package com.mysite.sitebackend.chart.market.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class MarketChart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String name; // idxNm 이름

    private String value; //clpr 전일종가
    private String avg; // fltRt 전일대비 변동폭
    private String high; // hipr 전일 고점
    private String low; // lopr 전일 저점
    private String yavg; // lsYrEdVsFltRg 52주 평균 변동폭

    @DateTimeFormat(pattern = "YYYYMMDD")
    private String date; // basDt 날짜
}
