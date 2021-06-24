package com.xbruce.behavioral.memento;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @ClassName: SSDDisk
 * @Description: 移动硬盘，用于在外部保存存档对象
 * @Author xbruce | xbruce121@163.com
 * @date 3/13/21 16:04 PM
 * @Version 1.0
 */
public class SSDDisk {

    private List<DarkSoulsMemento> darkSoulsMementos = Lists.newArrayList();

    public void addDarkSoulsMemento(DarkSoulsMemento memento) {

        this.darkSoulsMementos.add(memento);
    }

    public DarkSoulsMemento getDarkSoulsMemento(int index) {
        return darkSoulsMementos.get(index);
    }

}
