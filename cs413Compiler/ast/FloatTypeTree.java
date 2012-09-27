/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import visitor.*;

public class FloatTypeTree extends AST {

    public FloatTypeTree() {
    }

    public Object accept(ASTVisitor v) {
        return v.visitFloatTypeTree(this);
    }

}
