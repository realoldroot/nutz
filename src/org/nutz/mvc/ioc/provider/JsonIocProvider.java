package org.nutz.mvc.ioc.provider;

import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.impl.ScopeContext;
import org.nutz.ioc.loader.json.JsonLoader;
import org.nutz.mvc.IocProvider;
import org.nutz.mvc.NutConfig;

/**
 * 请使用ComboIocProvider
 */
@Deprecated
public class JsonIocProvider implements IocProvider {

    @Override
    public Ioc create(NutConfig config, String[] args) {
        return new NutIoc(new JsonLoader(args), new ScopeContext("app"), "app");
    }

}
