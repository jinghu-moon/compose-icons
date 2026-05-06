package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashBanknoteOff: ImageVector
    get() {
        if (_cashBanknoteOff != null) return _cashBanknoteOff!!
        _cashBanknoteOff = tablerOutlineIcon(
            name = "CashBanknoteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.88 9.878c-.768 .756-1.072 1.865-.796 2.907 .276 1.042 1.089 1.855 2.131 2.132 1.042 .276 2.151-.027 2.907-.796M14.702 10.696c-.298-.615-.796-1.11-1.412-1.405")
            addPathData("M10 6h9c1.105 0 2 .895 2 2v8c0 .294-.064 .574-.178 .825M18 18h-13C3.895 18 3 17.105 3 16v-8C3 6.895 3.895 6 5 6h1")
            addPathData("M18 12h.01")
            addPathData("M6 12h.01")
            addPathData("M3 3 21 21")
        }
        return _cashBanknoteOff!!
    }

private var _cashBanknoteOff: ImageVector? = null
