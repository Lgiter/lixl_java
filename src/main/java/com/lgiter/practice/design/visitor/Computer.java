package com.lgiter.practice.design.visitor;

/**
 * @Author: lixiaolong5
 * @Description:
 * @Date: 2024-08-02
 */
public class Computer implements ComputerPart{
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
