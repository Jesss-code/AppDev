package school.portal.appdev.models

    class UserInfo {
        object user {
            fun create(): UserInfo = UserInfo()
            var id = ""
            var school = ""
            var pass = ""
            var semester = "AY 2019-2020 1st Semester"
        }
}