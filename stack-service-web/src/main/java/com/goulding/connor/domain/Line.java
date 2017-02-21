package com.goulding.connor.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by connor on 14/02/17.
 */
@Entity
public class Line {

    @Id
    @GeneratedValue
    private Long lineId;

    @Column(name = "NUMBER_1")
    private Integer number1;

    @Column(name = "NUMBER_2")
    private Integer number2;

    @Column(name = "NUMBER_3")
    private Integer number3;

    public Line() {
    }

    public Line(Long lineId, Integer number1, Integer number2, Integer number3) {
        this.lineId = lineId;
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public Long getLineId() {
        return lineId;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Integer getNumber3() {
        return number3;
    }

    public void setNumber3(Integer number3) {
        this.number3 = number3;
    }
}
