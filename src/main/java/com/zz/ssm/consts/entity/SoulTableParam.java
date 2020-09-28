package com.zz.ssm.consts.entity;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */
public class SoulTableParam {
    /**
     * 条件集合
     **/
//    private List<SoulTable> filterSos;
    private String filterSos;

    /**
     * 属性名
     */
    private String field;
    /***
     * 排序方式
     * asc 或者 desc
     */
    private String order;

    /**
     * 页码
     */
    private Long page;
    /***
     * 分页大小
     */
    private Long size;
    public String getFilterSos() {
        return filterSos;
    }
    public void setFilterSos(String filterSos) {
        this.filterSos = filterSos;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public String getOrder() {
        return order;
    }
    public void setOrder(String order) {
        this.order = order;
    }
    public Long getPage() {
        return page;
    }
    public void setPage(Long page) {
        this.page = page;
    }
    public Long getSize() {
        return size;
    }
    public void setSize(Long size) {
        this.size = size;
    }



    public SoulTableParam(String filterSos, String field, String order, Long page, Long size) {
        super();
        this.filterSos = filterSos;
        this.field = field;
        this.order = order;
        this.page = page;
        this.size = size;
    }
    public SoulTableParam() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "SoulTableParam [filterSos=" + filterSos + ", field=" + field + ", order=" + order + ", page=" + page
                + ", size=" + size + "]";
    }
}
