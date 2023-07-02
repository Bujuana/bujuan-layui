
window.rootPath = (function (src) {
    src = document.scripts[document.scripts.length - 1].src;
    return src.substring(0, src.lastIndexOf("/") + 1);
})();

layui.config({
    base: rootPath + "extend/",
    version: true
}).extend({
    miniAdmin: "lay/admin", // 后台扩展
    miniMenu: "lay/menu", // 菜单扩展
    miniTab: "lay/tab", // tab扩展
    miniTheme: "lay/theme", // 主题扩展
    miniTongji: "lay/tongji", // 统计扩展
    step: 'step-lay/step', // 分步表单扩展
    treetable: 'treetable-lay/treetable', //table树形扩展
    tableSelect: 'tableSelect/tableSelect', // table选择扩展
    echarts: 'echarts/echarts', // echarts图表扩展
    echartsTheme: 'echarts/echartsTheme', // echarts图表主题扩展
    layarea: 'layarea/layarea', //  省市县区三级联动下拉选择器
});
