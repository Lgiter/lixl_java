package com.lgiter.practice.design.visitor;

/**
 * @Author: lixiaolong5
 * @Description:
 * @Date: 2024-08-02
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor visitor);
}
