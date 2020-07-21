package behavior.chain.of.responsibility

/**
 *@date: 2019/5/12 : 下午 06:31
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/

class Director(
    name: String
) : Leader(name) {

    override fun handlerRequest(request: LeaveRequest) {
        request.displayLeaveRequest()

        if (request.leaveOfDay < 3) {
            println("主任：$name 允許請假")
        } else {
            nextLeader?.handlerRequest(request)
        }
    }
}