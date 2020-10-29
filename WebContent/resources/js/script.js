var images=new Array('homecovernewen1-eg-en','homecovernewen2-eg-en','homecovernewen3-eg-en', 'homecovernewen4-eg-en');
var nextimage=0;

doSlideshow();

function doSlideshow()
{
    if($('.slideshowimage').length!=0)
    {
        $('.slideshowimage').fadeOut(500,function(){slideshowFadeIn();$(this).remove()});
    }
    else
    {
        slideshowFadeIn();
    }
}
function slideshowFadeIn()
{
    $('.header-sec').prepend($('<img class="slideshowimage" src="'+images[nextimage++]+'" style="display:none">').fadeIn(500,function(){setTimeout(doSlideshow,1000);}));
    if(nextimage>=images.length)
        nextimage=0;
}
