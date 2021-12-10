package com.example.demo.leetcode;

public class Code176 {

    //mysql 题目

    //176. 第二高的薪水

    //    select ifnull((select Salary from  Employee where 1= 1 group by Salary order by Salary  desc  limit 1,1),null) as SecondHighestSalary
}
