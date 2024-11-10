package com.javarush.task.pro.task06.task0616;

/* 
Учет работников
*/

public class Solution {
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Test{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.name+" "+solution.position+" "+solution.salary);
        solution.setPosition("Creator");
        solution.setSalary(1578789123);
        System.out.println(solution.name+" "+solution.position+" "+solution.salary);
    }
}
