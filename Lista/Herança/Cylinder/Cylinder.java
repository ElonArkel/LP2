<html>
<head>
<title>Cylinder.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cc7832;}
.s1 { color: #a9b7c6;}
.s2 { color: #808080;}
.s3 { color: #6897bb;}
</style>
</head>
<body bgcolor="#2b2b2b">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Cylinder.java</font>
</center></td></tr></table>
<pre><span class="s0">public class </span><span class="s1">Cylinder </span><span class="s0">extends </span><span class="s1">Circle {  </span><span class="s2">// Save as &quot;Cylinder.java&quot;</span>
    <span class="s0">private double </span><span class="s1">height</span><span class="s0">;  </span><span class="s2">// private variable</span>

    <span class="s2">// Constructor with default color, radius and height</span>
    <span class="s0">public </span><span class="s1">Cylinder() {</span>
        <span class="s0">super</span><span class="s1">()</span><span class="s0">;        </span><span class="s2">// call superclass no-arg constructor Circle()</span>
        <span class="s1">height = </span><span class="s3">1.0</span><span class="s0">;</span>
    <span class="s1">}</span>
    <span class="s2">// Constructor with default radius, color but given height</span>
    <span class="s0">public </span><span class="s1">Cylinder(</span><span class="s0">double </span><span class="s1">height) {</span>
        <span class="s0">super</span><span class="s1">()</span><span class="s0">;        </span><span class="s2">// call superclass no-arg constructor Circle()</span>
        <span class="s0">this</span><span class="s1">.height = height</span><span class="s0">;</span>
    <span class="s1">}</span>
    <span class="s2">// Constructor with default color, but given radius, height</span>
    <span class="s0">public </span><span class="s1">Cylinder(</span><span class="s0">double </span><span class="s1">radius</span><span class="s0">, double </span><span class="s1">height) {</span>
        <span class="s0">super</span><span class="s1">(radius)</span><span class="s0">;  </span><span class="s2">// call superclass constructor Circle(r)</span>
        <span class="s0">this</span><span class="s1">.height = height</span><span class="s0">;</span>
    <span class="s1">}</span>

    <span class="s2">// A public method for retrieving the height</span>
    <span class="s0">public double </span><span class="s1">getHeight() {</span>
        <span class="s0">return </span><span class="s1">height</span><span class="s0">;</span>
    <span class="s1">}</span>

    <span class="s2">// A public method for computing the volume of cylinder</span>
    <span class="s2">//  use superclass method getArea() to get the base area</span>
    <span class="s0">public double </span><span class="s1">getVolume() {</span>
        <span class="s0">return </span><span class="s1">getArea()*height</span><span class="s0">;</span>
    <span class="s1">}</span>
<span class="s1">}</span></pre>
</body>
</html>