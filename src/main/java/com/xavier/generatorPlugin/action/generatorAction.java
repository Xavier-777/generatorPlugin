package com.xavier.generatorPlugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.vfs.VirtualFile;
import com.xavier.generatorPlugin.dialog.EditorPathDialog;

public class generatorAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        VirtualFile file = e.getRequiredData(CommonDataKeys.VIRTUAL_FILE);
        if (file.isDirectory()) {
            String path = file.getPath();
            System.out.println(path);
            new EditorPathDialog().show();
        }else {
            try {
                throw new Exception();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("只能在文件夹创建，不允许在文件出建立");
            }
        }
    }
}
