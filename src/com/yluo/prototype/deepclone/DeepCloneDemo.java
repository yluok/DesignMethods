package com.yluo.prototype.deepclone;

/**
 * 测试类
 * 测试结果：
 * 齐天大圣的金箍棒和其深克隆分身的金箍棒是否一致：false
 * 齐天大圣的金箍棒和其浅克隆分身的金箍棒是否一致：true
 */
public class DeepCloneDemo {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.setJinGuBang(new JinGuBang(100,20));
        try {
            //深克隆
            QiTianDaSheng qiTianDaSheng_clone = (QiTianDaSheng)qiTianDaSheng.clone();
            System.out.println("齐天大圣的金箍棒和其深克隆分身的金箍棒是否一致：" + (qiTianDaSheng.getJinGuBang() == qiTianDaSheng_clone.getJinGuBang()));
        }catch (Exception e) {
            e.printStackTrace();
        }

        //浅克隆测试
        QiTianDaSheng qiTianDaSheng_shallow = qiTianDaSheng.shadowClone(qiTianDaSheng);
        System.out.println("齐天大圣的金箍棒和其浅克隆分身的金箍棒是否一致：" + (qiTianDaSheng.getJinGuBang() == qiTianDaSheng_shallow.getJinGuBang()));

    }
}
