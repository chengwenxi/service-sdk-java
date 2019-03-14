package org.irisnet.service;

public interface IrisCallBack<T,E> {
    /**
     *
     * @param response 服务调用方/提供方通过区块链传递的数据(具体数据格式取决于双方定义)
     * 注意:方法体内不要使用try catch捕获异常，否则执行错误rollback无法执行
     */
    T process(E response) throws Exception;
}
