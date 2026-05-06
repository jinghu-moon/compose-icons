package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashBanknoteEdit: ImageVector
    get() {
        if (_cashBanknoteEdit != null) return _cashBanknoteEdit!!
        _cashBanknoteEdit = tablerOutlineIcon(
            name = "CashBanknoteEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 18h-6C3.895 18 3 17.105 3 16v-8C3 6.895 3.895 6 5 6h14c1.105 0 2 .895 2 2v3")
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M6 12h.01")
            addPathData("M18.42 15.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L18 22h-3v-3l3.42-3.39")
        }
        return _cashBanknoteEdit!!
    }

private var _cashBanknoteEdit: ImageVector? = null
