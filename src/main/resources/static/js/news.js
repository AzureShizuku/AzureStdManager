window.addEventListener('load', function () {
    $(function(){
        $(".category li").click(function(){
            $(this).addClass('category__item--active').siblings().removeClass('category__item--active')
            let index = $(this).index();
            $('.news ul').eq(index).show().siblings().hide();
        })

        let Dataul = $(`<ul class="news" style="transform: translateY(-20px);">
        <li class="news__item news__tag-2" >
            <a class="news__title news__content ellipsis">
                <img class="coverFit" src="image/newsimg/阿贝多.jpg">
                <div class="news__info">
                    <h3 class="ellipsis" title="《原神》2.3版本「皑尘与雪影」前瞻特别节目回顾长图">《原神》2.3版本「皑尘与雪影」前瞻特别节目回顾长图 </h3>
                    <p class="news__summary"></p>
                </div>
            </a>
            <div class="news__meta">
                <div class="news__date">2021/11/04</div>
                <a class="news__category news__cate-2">新闻</a>
            </div>
        </li>
        <li class="news__item news__tag-2">
            <a class="news__title news__content ellipsis">
                <img class="coverFit" src="image/newsimg/前瞻特别节.jpg">
                <div class="news__info">
                    <h3 class="ellipsis" title="《原神》2.3版本「皑尘与雪影」前瞻特别节目">《原神》2.3版本「皑尘与雪影」前瞻特别节目</h3>
                    <p class="news__summary"></p>
                </div>
            </a>
            <div class="news__meta">
                <div class="news__date">2021/11/04</div>
                <a class="news__category news__cate-2">新闻</a>
            </div>
        </li>
       </ul>`);
        $(".news__more").click(function(){
          
            setTimeout(function(){
                $(".news__more").html("加载中...");
                $(".news ul").append(Dataul);
              },1000,);
              setTimeout(function(){
                $(".news__more").html("加载更多");
              },2000,);
            
            
        })
    })
})