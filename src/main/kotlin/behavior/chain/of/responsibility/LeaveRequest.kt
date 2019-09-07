package behavior.chain.of.responsibility

data class LeaveRequest(
    val name: String,
    val leaveOfDay: Int,
    val reason: String
) {
    fun displayLeaveRequest() {
        println("請假人員：$name，請假天數：$leaveOfDay，請假理由：$reason")
    }
}

