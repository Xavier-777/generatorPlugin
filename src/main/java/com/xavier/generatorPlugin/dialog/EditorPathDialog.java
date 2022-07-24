package com.xavier.generatorPlugin.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: meizhaowei
 * @Create: 2022/7/14 21:55
 * @Description: 编写path的对话框
 */
public class EditorPathDialog extends DialogWrapper {

    public EditorPathDialog() {
        super(true);
        setTitle("数据库反向生成代码");
        setSize(550, 0);
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel jPanel = new JPanel(new GridLayout(11, 2));
        //数据库
        JLabel databaseLabel = new JLabel("数据库:");
        JTextField databaseTF = new JTextField();
        jPanel.add(databaseLabel);
        jPanel.add(databaseTF);
        //表名
        JLabel tableLabel = new JLabel("表名:");
        JComboBox tableCB = new JComboBox();
        tableCB.addItem("table1");
        tableCB.addItem("table2");
        jPanel.add(tableLabel);
        jPanel.add(tableCB);
        //过滤表名前缀
        JLabel preTableLabel = new JLabel("过滤表名前缀:");
        JTextField preTableTF = new JTextField();
        jPanel.add(preTableLabel);
        jPanel.add(preTableTF);
        //过滤表名后缀
        JLabel sufTableLabel = new JLabel("过滤表名后缀:");
        JTextField sufTableTF = new JTextField();
        jPanel.add(sufTableLabel);
        jPanel.add(sufTableTF);
        //entity
        JLabel entityLabel = new JLabel("entity:");
        JTextField entityTF = new JTextField();
        jPanel.add(entityLabel);
        jPanel.add(entityTF);
        //mapperXml
        JLabel mapperXmlLabel = new JLabel("mapperXml:");
        JTextField mapperXmlTF = new JTextField();
        jPanel.add(mapperXmlLabel);
        jPanel.add(mapperXmlTF);
        //mapperJava
        JLabel mapperJavaLabel = new JLabel("mapperJava:");
        JTextField mapperJavaTF = new JTextField();
        jPanel.add(mapperJavaLabel);
        jPanel.add(mapperJavaTF);
        //service
        JLabel serviceLabel = new JLabel("service:");
        JTextField serviceTF = new JTextField();
        jPanel.add(serviceLabel);
        jPanel.add(serviceTF);
        //serviceImpl
        JLabel serviceImplLabel = new JLabel("serviceImpl:");
        JTextField serviceImplTF = new JTextField();
        jPanel.add(serviceImplLabel);
        jPanel.add(serviceImplTF);
        //controller
        JLabel controllerLabel = new JLabel("controller:");
        JTextField controllerTF = new JTextField();
        jPanel.add(controllerLabel);
        jPanel.add(controllerTF);
        //设置
        JButton setting = new JButton("设置");
        setting.addActionListener(e -> {
            new SettingDialog().show();
        });
        jPanel.add(setting);
        return jPanel;
    }

}
