package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = tablerOutlineIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8C3 6.343 4.343 5 6 5h12c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-12C4.343 19 3 17.657 3 16v-8")
            addPathData("M3 10h18")
            addPathData("M7 15h.01")
            addPathData("M11 15h2")
        }
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
