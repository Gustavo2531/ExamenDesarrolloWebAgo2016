import segundo.parcial.Divisa
import segundo.parcial.Role
import segundo.parcial.User
import segundo.parcial.UserRole

class BootStrap {

    def init = { servletContext ->
        User user = new User ("user","pass").save()
        Role admin = new Role("ROLE_ADMIN").save()
        UserRole.create(user,admin,true)
        }
    def destroy = {
    }
}
