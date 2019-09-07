package behavior.chain.of.responsibility

abstract class Leader(
    protected val name: String
) {
    protected var nextLeader: Leader? = null
        private set

    fun setNextLeader(leader: Leader) {
        this.nextLeader = leader
    }

    abstract fun handlerRequest(request: LeaveRequest)

}