import kotlin.math.roundToInt

fun main() {
    val amount = 1500
    val isVipClient = true
    val percent = 5.0
    val vipPercent = 1.0

    var sale = 0.0
    if (amount >= 1001 && amount <= 10_000) {
        sale = 100.0
    } else if (amount > 10_001) {
        sale = (amount * percent).roundToInt() / 100.0
    }
    if (isVipClient) {
        sale += (amount * vipPercent).roundToInt() / 100.0
    }
    println(sale)
}