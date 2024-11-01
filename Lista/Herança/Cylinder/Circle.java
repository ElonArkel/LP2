<html>
<head>
<title>Circle.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cc7832;}
.s1 { color: #a9b7c6;}
.s2 { color: #6897bb;}
.s3 { color: #6a8759;}
</style>
</head>
<body bgcolor="#2b2b2b">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Circle.java</font>
</center></td></tr></table>
<pre><span class="s0">public class </span><span class="s1">Circle {</span>
    <span class="s0">public double </span><span class="s1">radius = </span><span class="s2">1</span><span class="s0">;</span>
    <span class="s0">public </span><span class="s1">String color = </span><span class="s3">&quot;red&quot;</span><span class="s0">;</span>

    <span class="s0">public </span><span class="s1">Circle(){}</span>

    <span class="s0">public </span><span class="s1">Circle(</span><span class="s0">double </span><span class="s1">radius){</span>
        <span class="s0">this</span><span class="s1">.radius = radius</span><span class="s0">;</span>
    <span class="s1">}</span>
    <span class="s0">public </span><span class="s1">Circle(</span><span class="s0">double </span><span class="s1">radius</span><span class="s0">, </span><span class="s1">String color){</span>
        <span class="s0">this</span><span class="s1">.radius = radius</span><span class="s0">;</span>
        <span class="s0">this</span><span class="s1">.color = color</span><span class="s0">;</span>
    <span class="s1">}</span>

    <span class="s0">public double </span><span class="s1">getRadius() {</span>
        <span class="s0">return </span><span class="s1">radius</span><span class="s0">;</span>
    <span class="s1">}</span>
    <span class="s0">public void </span><span class="s1">setRadius() {</span>
        <span class="s0">this</span><span class="s1">.radius = radius</span><span class="s0">;</span>
    <span class="s1">}</span>

    <span class="s0">public </span><span class="s1">String getColor() {</span>
        <span class="s0">return </span><span class="s1">color</span><span class="s0">;</span>
    <span class="s1">}</span>

    <span class="s0">public void </span><span class="s1">setColor() {</span>
        <span class="s0">this</span><span class="s1">.color = color</span><span class="s0">;</span>
    <span class="s1">}</span>

    <span class="s0">public double </span><span class="s1">getArea() {</span>
        <span class="s0">return </span><span class="s1">Math.PI * radius * radius</span><span class="s0">;</span>
    <span class="s1">}</span>

    <span class="s0">public </span><span class="s1">String toString() {</span>
        <span class="s0">return </span><span class="s3">&quot;Circle [radius=&quot; </span><span class="s1">+ radius + </span><span class="s3">&quot;, color=&quot; </span><span class="s1">+ color + </span><span class="s3">&quot;]&quot;</span><span class="s0">;</span>
    <span class="s1">}</span>
<span class="s1">}</span></pre>
</body>
</html>