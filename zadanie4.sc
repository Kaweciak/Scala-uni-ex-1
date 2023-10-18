def insert [A] (list:List[A], pos: Int, value: A):List[A] =
{
  if pos < 0 then insert(list, 0, value)
  else if pos >= list.length then insert(list, list.length-1, value)
  else list.take(pos) ++ List(value) ++ list.drop(pos)
}