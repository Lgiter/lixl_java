package com.lgiter.practice.design.visitor;

/**
 * @Author: lixiaolong5
 * @Description:
 * @Date: 2024-08-02
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
