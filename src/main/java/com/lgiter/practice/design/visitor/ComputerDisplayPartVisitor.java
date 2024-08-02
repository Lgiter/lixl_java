package com.lgiter.practice.design.visitor;

/**
 * @Author: lixiaolong5
 * @Description:
 * @Date: 2024-08-02
 */
public class ComputerDisplayPartVisitor implements ComputerPartVisitor{

    @Override
    public void visit(Computer computer) {
        System.out.println("visit computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("visit mouse");

    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("visit keyboard");

    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("visit monitor");

    }
}
