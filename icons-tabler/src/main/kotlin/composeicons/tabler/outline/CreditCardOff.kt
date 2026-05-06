package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CreditCardOff: ImageVector
    get() {
        if (_creditCardOff != null) return _creditCardOff!!
        _creditCardOff = tablerOutlineIcon(
            name = "CreditCardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M9 5h9c1.657 0 3 1.343 3 3v8c0 .295-.043 .588-.128 .87")
            addPathData("M18.87 18.872c-.282 .085-.575 .128-.87 .128h-12C4.343 19 3 17.657 3 16v-8C3 6.648 3.894 5.505 5.124 5.13")
            addPathData("M3 11h8")
            addPathData("M15 11h6")
            addPathData("M7 15h.01")
            addPathData("M11 15h2")
        }
        return _creditCardOff!!
    }

private var _creditCardOff: ImageVector? = null
