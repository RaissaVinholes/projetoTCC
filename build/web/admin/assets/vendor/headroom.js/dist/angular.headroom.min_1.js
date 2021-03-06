/*!
 * headroom.js v0.9.4 - Give your page some headroom. Hide your header until you need it
 * Copyright (c) 2017 Nick Williams - http://wicky.nillia.ms/headroom.js
 * License: MIT
 */

!function(a,b){function c(a){return{scope:{tolerance:"=",offset:"=",classes:"=",scroller:"@"},link:function(b,c){var d={},e=a.options;for(var f in e)d[f]=b[f]||e[f];b.scroller&&(d.scroller=document.querySelector(b.scroller));var g=new a(c[0],d).init();b.$on("$destroy",function(){g.destroy()})}}}function d(){return b}a&&(c.$inject=["HeadroomService"],a.module("headroom",[]).directive("headroom",c).factory("HeadroomService",d))}(window.angular,window.Headroom);