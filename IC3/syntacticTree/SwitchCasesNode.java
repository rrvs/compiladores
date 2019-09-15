package syntacticTree;

import parser.*;


public class SwitchCasesNode extends GeneralNode{
    public SwitchCasesNode s1;
    public SwitchCaseNode s2;

    public SwitchCasesNode(Token t, SwitchCasesNode sw1, SwitchCaseNode sw2) {
    	super(t);
        s1 = sw1;
        s2 = sw2;
    }
}
