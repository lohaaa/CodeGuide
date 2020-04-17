package org.itstack.demo.jvm.instructions.loads.lload;

import org.itstack.demo.jvm.instructions.base.InstructionNoOperands;
import org.itstack.demo.jvm.rtda.Frame;

public class LLOAD_1 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        Long val = frame.localVars().getLong(1);
        frame.operandStack().pushLong(val);
    }

}
