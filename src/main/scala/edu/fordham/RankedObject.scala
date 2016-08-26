
object RankedObject extends App {
  type IdRaScTuple = (Int, Int, Double)
  type IdRaScArray = Array[IdRaScTuple]

  val rankScoreArray: IdRaScArray = new IdRaScArray(3)

  val a: IdRaScTuple = (1, 1, .7)
  val b: IdRaScTuple = (1, 2, .16)
  val c: IdRaScTuple = (1, 3, .14)

  rankScoreArray.update(0, b)
  rankScoreArray.update(1, a)
  rankScoreArray.update(2, c)

  println("RankScore Array unsorted: \n"+ rankScoreArray.mkString("\n")+ "\n")

  val rankScoreArraySortedByScore = rankScoreArray.sortWith( _._3 > _._3)

  println("RankScore Array sorted on score: \n"+ rankScoreArraySortedByScore.mkString("\n")+ "\n")

}