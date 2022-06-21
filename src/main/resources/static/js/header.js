window.addEventListener('load', function () {
	//导航区
	let audiu_on = document.getElementById('audiu_on')
	let audioimg = document.getElementById('audio_headerimg')
	let audio_off = this.document.getElementById('audio_off')
	//音频播放
	let audioyuans = document.getElementById("bgMusic");
	audiu_on.addEventListener('click',()=>{
		audio_off.style.display = 'block'
		audioyuans.pause();
		audioyuans.currentTime = 0;
		
	})
	audio_off.addEventListener('click',function(){
		audio_off.style.display = 'none'
		audioyuans.play();
		
	})
	
	
	
	let header_navitem = this.document.querySelector('.header_navitem')
	let header_Cloud = this.document.querySelector('.header_Cloud')
	let SuspendedStyle = header_navitem.querySelectorAll('a')
	let header__navbar = this.document.querySelector('.header__navbar')
	let current = 0
	for (let i = 0; i< SuspendedStyle.length; i++){
		SuspendedStyle[i].addEventListener('mouseenter',function(){
			animate(header_Cloud,this.offsetLeft);
		})
		header__navbar.addEventListener('mouseleave',function(){
			animate(header_Cloud,308);
		})
	}
})