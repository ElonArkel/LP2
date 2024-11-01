<html>
<head>
<title>TestCylinder.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cc7832;}
.s1 { color: #a9b7c6;}
.s2 { color: #808080;}
.s3 { color: #6a8759;}
.s4 { color: #6897bb;}
</style>
</head>
<body bgcolor="#2b2b2b">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
TestCylinder.java</font>
</center></td></tr></table>
<pre><span class="s0">public class </span><span class="s1">TestCylinder {  </span><span class="s2">// save as &quot;TestCylinder.java&quot;</span>
    <span class="s0">public static void </span><span class="s1">main (String[] args) {</span>
        <span class="s2">// Declare and allocate a new instance of cylinder</span>
        <span class="s2">//   with default color, radius, and height</span>
        <span class="s1">Cylinder c1 = </span><span class="s0">new </span><span class="s1">Cylinder()</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot;Cylinder:&quot;</span>
                <span class="s1">+ </span><span class="s3">&quot; radius=&quot; </span><span class="s1">+ c1.getRadius()</span>
                <span class="s1">+ </span><span class="s3">&quot; height=&quot; </span><span class="s1">+ c1.getHeight()</span>
                <span class="s1">+ </span><span class="s3">&quot; base area=&quot; </span><span class="s1">+ c1.getArea()</span>
                <span class="s1">+ </span><span class="s3">&quot; volume=&quot; </span><span class="s1">+ c1.getVolume())</span><span class="s0">;</span>

        <span class="s2">// Declare and allocate a new instance of cylinder</span>
        <span class="s2">//   specifying height, with default color and radius</span>
        <span class="s1">Cylinder c2 = </span><span class="s0">new </span><span class="s1">Cylinder(</span><span class="s4">10.0</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot;Cylinder:&quot;</span>
                <span class="s1">+ </span><span class="s3">&quot; radius=&quot; </span><span class="s1">+ c2.getRadius()</span>
                <span class="s1">+ </span><span class="s3">&quot; height=&quot; </span><span class="s1">+ c2.getHeight()</span>
                <span class="s1">+ </span><span class="s3">&quot; base area=&quot; </span><span class="s1">+ c2.getArea()</span>
                <span class="s1">+ </span><span class="s3">&quot; volume=&quot; </span><span class="s1">+ c2.getVolume())</span><span class="s0">;</span>

        <span class="s2">// Declare and allocate a new instance of cylinder</span>
        <span class="s2">//   specifying radius and height, with default color</span>
        <span class="s1">Cylinder c3 = </span><span class="s0">new </span><span class="s1">Cylinder(</span><span class="s4">2.0</span><span class="s0">, </span><span class="s4">10.0</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot;Cylinder:&quot;</span>
                <span class="s1">+ </span><span class="s3">&quot; radius=&quot; </span><span class="s1">+ c3.getRadius()</span>
                <span class="s1">+ </span><span class="s3">&quot; height=&quot; </span><span class="s1">+ c3.getHeight()</span>
                <span class="s1">+ </span><span class="s3">&quot; base area=&quot; </span><span class="s1">+ c3.getArea()</span>
                <span class="s1">+ </span><span class="s3">&quot; volume=&quot; </span><span class="s1">+ c3.getVolume())</span><span class="s0">;</span>
    <span class="s1">}</span>
<span class="s1">}</span></pre>
</body>
</html>