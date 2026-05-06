package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDinar: ImageVector
    get() {
        if (_currencyDinar != null) return _currencyDinar!!
        _currencyDinar = tablerOutlineIcon(
            name = "CurrencyDinar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 20.01v-.01")
            addPathData("M6 13l2.386-.9c.407-.153 .668-.552 .646-.986-.022-.434-.321-.804-.741-.916L6.777 9.794C6.358 9.683 6.058 9.314 6.035 8.881c-.023-.433 .235-.832 .64-.987L9 7")
            addPathData("M3 14v1c0 1.657 1.343 3 3 3h4.161c.851 0 1.663-.362 2.232-.995 .569-.633 .842-1.479 .751-2.325L12 4")
            addPathData("M16 17l1 1h2c.742-0 1.423-.411 1.769-1.068 .346-.657 .3-1.451-.12-2.063L17.996 11")
        }
        return _currencyDinar!!
    }

private var _currencyDinar: ImageVector? = null
