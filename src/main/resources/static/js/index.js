window.addEventListener('load', function () {
    const social = this.document.querySelector('.social')
    window.onscroll = function() { scrollFun() };
    function scrollFun() {
      if (document.body.scrollTop > 400 || document.documentElement.scrollTop > 400) {
        social.style.display = 'block';
      } else {
        social.style.display = 'none';
      }
  }
  let social__btn_on = this.document.querySelector('.social__btn_on')
  let social__btn_off = document.querySelector('.social__btn_off')
  let social__btn_on_img1 = document.querySelector('.social__btn_on_img1')
  let social__btn_on_img2 = document.querySelector('.social__btn_on_img2')
	social__btn_off.addEventListener('click',function(){
	social__btn_off.style.display = 'none'
	social__btn_on.style.display = 'block'
    animaters(social,1520);
	social__btn_on_img2.classList = 'socialrotate'
  })
  
  social__btn_on.addEventListener('click',function(){
	 social__btn_off.style.display = 'block'
	 social__btn_on.style.display = 'none'
    animaters(social,1345);
  })

  //登录
  let header__login = this.document.querySelector('.header__login')
  let close = this.document.querySelector('.close-icon')
  let x2 = this.document.getElementById('x2')
  let login = this.document.getElementById('login')
  let mimalogin = this.document.getElementById('mimalogin')
  let yzmloginer = this.document.getElementById('yzmloginer')
  let mimaloginer = this.document.getElementById('mimaloginer')//第一个
  let mimaloginers = this.document.getElementById('mimaloginers')//第二个
  let containerinput = this.document.getElementById('containerinput')
  let error_text = this.document.querySelector('.error-text')
  let MobilePhoneFormat = this.document.getElementById('MobilePhoneFormat')
  let mhy_toast = this.document.querySelector('.mhy-toast')
  header__login.addEventListener('click',function(){
    login.style.display = 'block'
  })
  close.addEventListener('click',function(){
    login.style.display = 'none'
  })
  mimaloginers.addEventListener('click',function(){
    mimalogin.style.display = 'block'
  })
  mimaloginer.addEventListener('click',function(){
    login.style.display = 'none'
  })
  yzmloginer.addEventListener('click',function(){
    mimalogin.style.display = 'none'
  })
  x2.addEventListener('click',function(){
    login.style.display = 'none'
  })

 

  	//判断用户在输入手机号格式是否正确
		let regtel = /^(13[0-9]|14[5|7]|15[0|1|2|3|4|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;

    containerinput.onblur = function() {
			if(regtel.test(this.value)) {
        error_text.style.display = 'none';
        MobilePhoneFormat.style.display = 'none'
        mhy_toast.style.display = 'none'
         //发送短信
  let VerificationCode = document.getElementById('VerificationCode');
  let time = 59;
  VerificationCode.addEventListener('click',function(){
    VerificationCode.disabled = true;
    var timer = setInterval(function(){
      if(time == 0) {
        // 清除定时器和复原按钮
        clearInterval(timer);
        VerificationCode.disabled = true;
        VerificationCode.innerHTML = '发送验证码'
        time = 59; //这个数需要重新开始
      } 
      else {
        VerificationCode.innerHTML = '已发送'+ time +'(S)';
        VerificationCode.disabled = false;
        time--;
      }
    },1000);
  })
			}

      else if(this.value.length == ''){
        error_text.style.display = 'block';
        mhy_toast.style.display = 'block'
      }
			else {
        MobilePhoneFormat.style.display = 'block'
        error_text.style.display = 'none';
        mhy_toast.style.display = 'block'
			}
		}
    setInterval(function () {
      mhy_toast.style.display = 'none'
    },5000)

    

    
  
  //footer
  let socialitemImg1 = this.document.getElementById('socialitemImg1')
  let socialitemImg2 = this.document.getElementById('socialitemImg2')
  let socialitemImg3 = this.document.getElementById('socialitemImg3')
  let socialitemImg4 = this.document.getElementById('socialitemImg4')
  let share__wrap = this.document.querySelector('.share__wrap')
  let qxtc = this.document.querySelector('.qxtc')

  socialitemImg1.addEventListener('mousemove',function(){
    socialitemImg1.src = 'image/新浪微博 (2).png'
  })
  socialitemImg1.addEventListener('mouseout',function(){
    socialitemImg1.src = 'image/新浪微博1..png'
  })
  socialitemImg2.addEventListener('mousemove',function(){
    socialitemImg2.src = 'image/微信 (5).png'
  })
  socialitemImg2.addEventListener('mouseout',function(){
    socialitemImg2.src = 'image/微信 (2).png'
  })
  socialitemImg3.addEventListener('mousemove',function(){
    socialitemImg3.src = 'image/qq (1).png'
  })
  socialitemImg3.addEventListener('mouseout',function(){
    socialitemImg3.src = 'image/qq.png'
  })
  socialitemImg4.addEventListener('mousemove',function(){
    socialitemImg4.src = 'image/分享方式 (1).png'
    share__wrap.style.display = 'block'
  })
  socialitemImg4.addEventListener('mouseout',function(){
    socialitemImg4.src = 'image/分享方式.png'
  })
  qxtc.addEventListener('mouseout',function(){
    share__wrap.style.display = 'none'
  })



})