import kotlin.math.roundToInt

fun main() {
    val amount = 8000
    val isVipClient = true
    val percent = 5.0
    val vipPercent = 1.0

    var sale =
        if (amount in 1001..10_000) {
            100.0
        } else if (amount >= 10_001) {
            (amount * percent).roundToInt() / 100.0
        } else {
            0.0
        }
    if (isVipClient) sale += (amount * vipPercent).roundToInt() / 100.0
    println(sale)
}