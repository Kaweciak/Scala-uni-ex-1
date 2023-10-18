val reverse4 = [A, B, C, D] => (tuple1: (A, B, C, D)) => (tuple1._4, tuple1._3, tuple1._2, tuple1._1)

//tests
reverse4 (1, 2, 3, 4)
reverse4 ("a", "b", "c", "d")