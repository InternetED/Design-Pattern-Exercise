package behavior.chain.of.responsibility

class Manager(name: String) : Leader(name) {

    override fun handlerRequest(request: LeaveRequest) {

        request.displayLeaveRequest()

        if (request.leaveOfDay < 10) {
            println("經理：$name 允許請假")
        } else {
            nextLeader?.handlerRequest(request)
        }
    }
}