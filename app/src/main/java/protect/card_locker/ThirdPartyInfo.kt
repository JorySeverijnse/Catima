package protect.card_locker

class ThirdPartyInfo(
    private val mName: String,
    private val mUrl: String,
    private val mLicense: String,
) {
    fun name(): String = mName

    fun url(): String = mUrl

    fun license(): String = mLicense

    fun toHtml(): String = String.format("<a href=\"%s\">%s</a> (%s)", url(), name(), license())
}
