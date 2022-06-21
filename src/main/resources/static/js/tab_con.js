window.addEventListener('load', function () {
    $(function(){
        $(".news__tab__list__ul li").click(function(){
            //链式编程操作
            //1.点击上部li，当前li添加currenters类，其余移除
            $(this).addClass('currenters').siblings().removeClass('currenters')
            let index = $(this).index();
            $('.tab_con .item').eq(index).show().siblings().hide();
        })
    })

})