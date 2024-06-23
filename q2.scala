@main def main()={
    var a: Int = 2;
    var b: Int = 3;
    var c: Int = 4;
    var d: Int = 5;
    var k: Float = 4.3f;
    b -= 1;
    d -= 1;
    println(s" - -b * a + c *d - - : ${ (b) * a + c *(d)} ");
    a = a+1;
    println(s"a++ : ${a}");
    println (s"-2 * ( g - k ) +c : ${-2 * ( a - k ) +c}");  //is it a or g?
    c += 1;
    println (s"c=c++ : $c");
    c += 1 ;
    c = c + a ;
    a += 1 ;
    println (s"c=++c*a++ : ${c}");
}