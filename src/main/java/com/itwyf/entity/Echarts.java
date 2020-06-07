package com.itwyf.entity;

/**
 * @program: EchartsDemo
 * @description:
 * @author: 吴云飞
 * @create: 2020-06-07 13:18
 */
public class Echarts {
    private int id;
    private String month;
    private int nums;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public Echarts() {
    }

    public Echarts(int id, String month, int nums) {
        this.id = id;
        this.month = month;
        this.nums = nums;
    }
}
