import com.github.mongobee.Mongobee


fun main() {
    val runner = Mongobee("mongodb://localhost:27017/TEST")
    runner.setDbName("TEST")  // host must be set if not set in URI
    runner.setChangeLogsScanPackage(
        "com.test.changelogs"
    )
    runner.execute()
}