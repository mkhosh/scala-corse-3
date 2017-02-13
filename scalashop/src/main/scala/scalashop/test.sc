import scalashop.{HorizontalBoxBlur, Img}

val v = for {
  i <- 1 to 5
  j <- 1 to 5
} yield (i, j)

v.foldLeft((0, 0)) { case ((acc0, acc1), (p0, p1)) => (acc0 + p0, acc1 + p1) }

val n = 3
val numTasks = 3
val intervalLength = Math.ceil(n.toFloat / numTasks.toFloat).toInt
//val intervalLength = n/numTasks

val r = 0 to n by intervalLength
val w = 3
val h = 3
val src = new Img(w, h)
val dst = new Img(w, h)
src(0, 0) = 0;
src(1, 0) = 1;
src(2, 0) = 2
src(0, 1) = 3;
src(1, 1) = 4;
src(2, 1) = 5
src(0, 2) = 6;
src(1, 2) = 7;
src(2, 2) = 8
src

HorizontalBoxBlur.blur(src,dst,0,5,1)
//HorizontalBoxBlur.blur(src, dst, 0, 2, 1)
dst

Range(0,3)
0 to 3