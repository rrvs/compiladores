package syntacticTree;

import parser.*;


public class SwitchCaseNode extends StatementNode {
    public StatementNode stat;

    public SwitchCaseNode(Token t, StatementNode s) {
        super(t);
        stat = s;
    }
}
