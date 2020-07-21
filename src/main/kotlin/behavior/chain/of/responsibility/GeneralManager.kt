package behavior.chain.of.responsibility

class GeneralManager(name: String) : Leader(name) {

    override fun handlerRequest(request: LeaveRequest) {

        if (request.leaveOfDay < 30) {
            request.displayLeaveRequest()
        }else{
            println("請假超過 30 天，乾脆辭職好了。")
        }
    }
}