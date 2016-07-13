<!DOCTYPE html>
<html>
<#import "js/common.ftl" as con />
<head>
    <meta http-equiv="pragram" content="no-cache">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>凯迪拉克经销商</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">
    <link href="${con.bathPath}css/swiper-3.0.8.css" rel="stylesheet" type="text/css">
    <link href="${con.bathPath}css/iconfont.css" rel="stylesheet" type="text/css">
    <link href="${con.bathPath}css/style.css" rel="stylesheet" type="text/css">
    <script src="${con.bathPath}js/jquery-1.11.1.min.js"></script>
    <script src="${con.bathPath}js/swiper.min-3.1.0.js"></script>
</head>    
<body>
<div class="head">
	促销信息 ${con.bathPath}
	<div class="sorts">
		<span onclick="$(this).siblings().toggle();"><i class="iconfont icon-fenlei"></i>车型选择</span>
		<div>
			<a href="javascript:;">车辆型号1</a>
			<a href="javascript:;">车辆型号2</a>
			<a href="javascript:;">车辆型号4</a>
			<a href="javascript:;">车辆型号5</a>
			<a href="javascript:;">车辆型号6</a>
		</div>
	</div>
</div>
<ul class="activities">
	<li>
		<a href="javascript:;">
			<img src="${con.bathPath}images/test.jpg"/>
		</a>
		<a class="goodsImgInfo" href="javascript:;">
			凯迪拉克XT5售价35.99万起
			<span class="r">详情>>></span>
		</a>
		<div class="time">发布时间：2015-06-28</div>
	</li>
	<li>
		<a href="javascript:;">
			<img src="${con.bathPath}images/test.jpg"/>
		</a>
		<a class="goodsImgInfo" href="javascript:;">
			凯迪拉克XT5售价35.99万起
			<span class="r">详情>>></span>
		</a>
		<div class="time">发布时间：2015-06-28</div>
	</li>
	<li>
		<a href="javascript:;">
			<img src="${con.bathPath}images/test.jpg"/>
		</a>
		<a class="goodsImgInfo" href="javascript:;">
			凯迪拉克XT5售价35.99万起
			<span class="r">详情>>></span>
		</a>
		<div class="time">发布时间：2015-06-28</div>
	</li>
	<li>
		<a href="javascript:;">
			<img src="images/test.jpg"/>
		</a>
		<a class="goodsImgInfo" href="javascript:;">
			凯迪拉克XT5售价35.99万起
			<span class="r">详情>>></span>
		</a>
		<div class="time">发布时间：2015-06-28</div>
	</li>
	<li>
		<a href="javascript:;">
			<img src="${con.bathPath}images/test.jpg"/>
		</a>
		<a class="goodsImgInfo" href="javascript:;">
			凯迪拉克XT5售价35.99万起
			<span class="r">详情>>></span>
		</a>
		<div class="time">发布时间：2015-06-28</div>
	</li>
</ul>
<div class="ajaxMore">加载更多</div>
<script>
	$(".activities").hover(function(){
		$(".sorts div").hide();
	});
	$(window).scroll(function(){
		$(".sorts div").hide();
	})
</script>
</body>
</html>