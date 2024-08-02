package com.lgiter.practice.design.visitor;

/**
 * @Author: lixiaolong5
 * @Description:
 * @Date: 2024-08-02
 */
public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
