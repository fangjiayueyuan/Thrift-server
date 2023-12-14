package com.meituan.mdp.sample.service.impl;

import com.meituan.mdp.boot.starter.thrift.annotation.MdpThriftServer;
import com.meituan.mdp.sample.thrift.MyInterface;
import org.apache.thrift.TException;

/**
 * @projectName: sample
 * @package: com.meituan.mdp.sample.service.impl
 * @className: MyInterfaceService
 * @author: fangjiayueyuan
 * @description: TODO
 * @date: 2023/12/14 22:01
 * @version: 1.0
 */
@MdpThriftServer(port=7101)
public class MyInterfaceService implements MyInterface.Iface{
    @Override
    public String sayHello(String username) throws TException {
        return "Hello," + username;
    }

    @Override
    public String sayGoodBye(String username) throws TException {
        return "GooodBye," + username;
    }
}
