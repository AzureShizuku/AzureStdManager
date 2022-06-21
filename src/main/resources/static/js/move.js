function animate(obj, target, callback) {
    clearInterval(obj.timer);
    obj.timer = setInterval(function(){
        var step = (target - obj.offsetLeft) / 1;
        step = step > 0 ? Math.ceil(step) : Math.floor(step);
        if (obj.offsetLeft == target) {
            clearInterval(obj.timer);
            if(callback) {
                callback();
            }
        }
        obj.style.left = obj.offsetLeft + step + 'px';
    },);
}