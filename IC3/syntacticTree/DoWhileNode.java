package syntacticTree;

import parser.*;


public class DoWhileNode extends StatementNode {
     public ExpreNode expr1;
     public StatementNode stat;

    public DoWhileNode(Token t, ExpreNode e, StatementNode s) {
        super(t);
        expr1 = e;
        stat = s;
    }
}
