package com.zz.ssm.consts.entity;

import java.util.List;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */
public class SoulTable {

    private boolean head;
    private String prefix;
    private String mode;
    private String field;
    private String value;
    private String type;
    private String groupId;

    private List<SoulTable> children;//子集合

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<SoulTable> getChildren() {
        return children;
    }

    public void setChildren(List<SoulTable> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "SoulTable [head=" + head + ", prefix=" + prefix + ", mode=" + mode + ", field=" + field + ", value="
                + value + ", type=" + type + ", groupId=" + groupId + ", children=" + children + "]";
    }

    public SoulTable() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SoulTable(boolean head, String prefix, String mode, String field, String value, String type, String groupId,
                     List<SoulTable> children) {
        super();
        this.head = head;
        this.prefix = prefix;
        this.mode = mode;
        this.field = field;
        this.value = value;
        this.type = type;
        this.groupId = groupId;
        this.children = children;
    }



}
