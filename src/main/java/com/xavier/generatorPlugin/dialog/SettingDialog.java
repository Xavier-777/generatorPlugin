package com.xavier.generatorPlugin.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: meizhaowei
 * @Create: 2022/7/14 21:55
 * @Description: 设置对话框
 */
public class SettingDialog extends DialogWrapper {

    public SettingDialog() {
        super(true);
        setTitle("设置");
        setSize(450, 0);
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel jPanel = new JPanel(new GridLayout(8, 2));
        //url
        JLabel urlLabel = new JLabel("url:");
        JTextField urlTF = new JTextField();
        jPanel.add(urlLabel);
        jPanel.add(urlTF);
        //username
        JLabel usernameLabel = new JLabel("username:");
        JTextField usernameTF = new JTextField();
        jPanel.add(usernameLabel);
        jPanel.add(usernameTF);
        //password
        JLabel passwordLabel = new JLabel("password:");
        JTextField passwordTF = new JTextField();
        jPanel.add(passwordLabel);
        jPanel.add(passwordTF);
        //测试链接按钮
        JLabel connectStatus = new JLabel("成功/失败");
        JButton testConnect = new JButton("测试连接");
        jPanel.add(connectStatus);
        jPanel.add(testConnect);
        //作者
        JLabel authorLabel = new JLabel("作者:");
        JTextField authorTF = new JTextField();
        jPanel.add(authorLabel);
        jPanel.add(authorTF);
        //ORM框架
        JLabel ormTypeLabel = new JLabel("ORM框架:");
        JComboBox ormTypeCB = new JComboBox();
        //这里先写死，后续对接后再获取
        ormTypeCB.addItem("Mybatis-plus");
        ormTypeCB.addItem("Hand");
        jPanel.add(ormTypeLabel);
        jPanel.add(ormTypeCB);
        //是否启用Swagger
        JLabel enableSwaggerLabel = new JLabel("是否启用Swagger:");
        JComboBox enableSwaggerCB = new JComboBox();
        enableSwaggerCB.addItem("是");
        enableSwaggerCB.addItem("否");
        jPanel.add(enableSwaggerLabel);
        jPanel.add(enableSwaggerCB);
        //是否启用Lombok
        JLabel enableLombokLabel = new JLabel("是否启用Lombok:");
        JComboBox enableLombokCB = new JComboBox();
        enableLombokCB.addItem("是");
        enableLombokCB.addItem("否");
        jPanel.add(enableLombokLabel);
        jPanel.add(enableLombokCB);
        return jPanel;
    }
}
