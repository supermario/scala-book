
// Implement isSorted, which checks whether an Array[A] is sorted according to a given comparison function:

def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
  @annotation.tailrec
  def loop(n: Int): Boolean =
    if (n - 1 < 0) true
    else if (!ordered(as(n-1), as(n))) false
    else loop(n - 1)

  loop(as.length - 1)
}
