<%@page import="com.car.controller.CustomController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="common.jsp" %>    
    
    
<html>
<head>
<base href="<%=basePath%>"></base>
    <meta http-equiv="pragram" content="no-cache">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>凯迪拉克经销商</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">
    <link href="css/swiper-3.0.8.css" rel="stylesheet" type="text/css">
    <link href="css/iconfont.css" rel="stylesheet" type="text/css">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/swiper.min-3.1.0.js"></script>
</head>    
<body>
	<div class="head">车主中心</div>
	<div class="personalCenter">
		<div class="personalInfo">
			<div class="cf">
				<div style="background-image: url(images/personalHead.jpg);" class="bg-cover"></div>
				<div class="l">
					<div class="personalName">
						<strong>姓&nbsp;&nbsp;&nbsp;名</strong> ${path }
					</div>
					<div class="personalPhone">
						<strong>手机号</strong>  138 8888 8888
					</div>
				</div>
			</div>
			<div class="personalTitle">我的爱车</div>
			<ul class="carCx noMarginBottom">
				<li class="flexBox">
					<a href="javascript:;" style="background-image: url(images/car1.jpg);" class="bg-cover"></a>
					<div class="flexChild">
						<div>ATS-L</div>
						<div>车牌号：沪A 87718</div>
						<div>车架号：PK28145231256521447</div>
					</div>
				</li>
			</ul>
			<div class="personalTitle">我的服务记录</div>
			<a class="personalContent" href="javascript:;">预约试驾记录</a>
			<a class="personalContent" href="javascript:;">在线询价记录</a>
			<div class="personalTitle">
				我的礼券
			</div>
			<a class="personalContent" href="javascript:;">
				<div>您共获得？？？礼券</div>
				<div>未使用？？？</div>
			</a>
			<div class="personalTitle">我的专属客服</div>
			<ul class="kfList nomarginTop">
				<li>
					<div style="background-image: url(images/ren1.jpg);" class="bg-cover"></div>
					<div class="kfInfo">
						<div class="kfName">代用名</div>
						<div>售前经理</div>
						<div>电话  138 8888 888</div>
					</div>
					<div class="r">
						 <a href="tel:86290419">在线联系</a> 
						<a href="tel:86290419">拨打电话</a>
					</div>
				</li>
				<li>
					<div style="background-image: url(images/ren1.jpg);" class="bg-cover"></div>
					<div class="kfInfo">
						<div class="kfName">代用名</div>
						<div>售前经理</div>
						<div>电话  138 8888 888</div>
					</div>
					<div class="r">
						 <a href="tel:86290419">在线联系</a> 
						<a href="tel:86290419">拨打电话</a>
					</div>
				</li>
				<li>
					<div style="background-image: url(images/ren1.jpg);" class="bg-cover"></div>
					<div class="kfInfo">
						<div class="kfName">代用名</div>
						<div>售前经理</div>
						<div>电话  138 8888 888</div>
					</div>
					<div class="r">
						 <a href="tel:86290419">在线联系</a> 
						<a href="tel:86290419">拨打电话</a>
					</div>
				</li>
				<li>
					<div style="background-image: url(images/ren1.jpg);" class="bg-cover"></div>
					<div class="kfInfo">
						<div class="kfName">代用名</div>
						<div>售前经理</div>
						<div>电话  138 8888 888</div>
					</div>
					<div class="r">
						 <a href="tel:86290419">在线联系</a> 
						<a href="tel:86290419">拨打电话</a>
					</div>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>