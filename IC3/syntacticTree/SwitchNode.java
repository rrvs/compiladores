package syntacticTree;

import parser.*;


public class SwitchNode extends StatementNode {
     public SwitchCasesNode s1;

    public SwitchNode(Token t, SwitchCasesNode s) {
        super(t);
        s1 = s;
    }
}
