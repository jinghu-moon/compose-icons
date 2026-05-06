package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashBanknote: ImageVector
    get() {
        if (_cashBanknote != null) return _cashBanknote!!
        _cashBanknote = tablerOutlineIcon(
            name = "CashBanknote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M3 8C3 6.895 3.895 6 5 6h14c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-14C3.895 18 3 17.105 3 16v-8")
            addPathData("M18 12h.01")
            addPathData("M6 12h.01")
        }
        return _cashBanknote!!
    }

private var _cashBanknote: ImageVector? = null
