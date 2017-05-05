

class Poker {

  def calculateThreeBetFraction(
                               opponents3BetCallFrequency:Double,
                               opponents4BetFrequency:Double
                               ):Double = {
    val raiseSize = 11
    val openSize = 3

    val myEquity = ???
    val opponentEquity = ???

    val evOnCall  = opponents3BetCallFrequency * (raiseSize*2* myEquity - raiseSize*2* opponentEquity)
    val evOnRaise = opponents4BetFrequency
    val evOnFold = 1.0 - opponents3BetCallFrequency - opponents4BetFrequency * (openSize + 1)

  }
}
