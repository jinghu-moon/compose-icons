package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CreditCardPay: ImageVector
    get() {
        if (_creditCardPay != null) return _creditCardPay!!
        _creditCardPay = tablerOutlineIcon(
            name = "CreditCardPay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19h-6C4.343 19 3 17.657 3 16v-8C3 6.343 4.343 5 6 5h12c1.657 0 3 1.343 3 3v4.5")
            addPathData("M3 10h18")
            addPathData("M16 19h6")
            addPathData("M19 16l3 3-3 3")
            addPathData("M7.005 15h.005")
            addPathData("M11 15h2")
        }
        return _creditCardPay!!
    }

private var _creditCardPay: ImageVector? = null
