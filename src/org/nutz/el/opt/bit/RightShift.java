package org.nutz.el.opt.bit;

import org.nutz.el.opt.TwoTernary;
/**
 * 右移
 * @author juqkai(juqkai@gmail.com)
 *
 */
public class RightShift extends TwoTernary{
    @Override
    public int fetchPriority() {
        return 5;
    }
    @Override
    public Object calculate() {
        Integer lval = (Integer) calculateItem(left);
        Integer rval = (Integer) calculateItem(right);
        return lval >> rval;
    }
    @Override
    public String fetchSelf() {
        return ">>";
    }

}
