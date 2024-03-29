/*
 * Copyright 2004-2006 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.framework.container.factory;

/**
 * @author higa
 * @org.seasar.framework.container.annotation.backport175.Aspect( value="aop.traceInterceptor",
 *                                                                pointcut="getAaa")
 * @org.seasar.framework.container.annotation.backport175.InterType({"fieldInterType"})
 * 
 */
public class Hoge {

    public String getAaa() {
        return null;
    }

    /**
     * @org.seasar.framework.container.annotation.backport175.Binding("hoge")
     */
    private String bbb;

    public String getBbb() {
        return bbb;
    }

    public void setBbb(String bbb) {
        this.bbb = bbb;
    }

    /**
     * @org.seasar.framework.container.annotation.backport175.Binding("foo")
     */
    private String ccc;

    public String getCcc() {
        return ccc;
    }

    /**
     * @org.seasar.framework.container.annotation.backport175.Binding("bar")
     */
    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    /**
     * @org.seasar.framework.container.annotation.backport175.InitMethod
     */
    public void init() {
    }

    /**
     * @org.seasar.framework.container.annotation.backport175.DestroyMethod
     */
    public void destroy() {
    }
}
