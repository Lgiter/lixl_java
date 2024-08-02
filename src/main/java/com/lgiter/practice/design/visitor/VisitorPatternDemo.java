package com.lgiter.practice.design.visitor;

/**
 * @Author: lixiaolong5
 * @Description:
 * @Date: 2024-08-02
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerDisplayPartVisitor());
    }
}
