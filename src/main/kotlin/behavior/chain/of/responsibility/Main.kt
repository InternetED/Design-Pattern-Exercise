package behavior.chain.of.responsibility


fun main() {
    val director: Leader = Director("王三")
    val manager: Leader = Manager("王二")
    val generalManager: Leader = GeneralManager("王一")

    director.setNextLeader(manager)
    manager.setNextLeader(generalManager)

    director.handlerRequest(LeaveRequest("阿花", 15, "回家上廁所"))

}