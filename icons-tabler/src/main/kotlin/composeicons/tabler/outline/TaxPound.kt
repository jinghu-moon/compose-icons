package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TaxPound: ImageVector
    get() {
        if (_taxPound != null) return _taxPound!!
        _taxPound = tablerOutlineIcon(
            name = "TaxPound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.487 21h7.026c1.278-0 2.479-.611 3.232-1.644 .753-1.033 .967-2.363 .576-3.58L17.615 10.47C16.95 8.402 15.027 7 12.855 7h-1.71C8.973 7 7.05 8.402 6.385 10.47L4.679 15.776c-.391 1.217-.177 2.547 .576 3.58 .753 1.033 1.954 1.644 3.232 1.644")
            addPathData("M15 3Q14 7 12 7 10 7 9 3h6")
            addPathData("M14 11h-1c-1.105 0-2 .895-2 2v2c0 1.105-.395 2-1.5 2h4.5")
            addPathData("M10 14h3")
        }
        return _taxPound!!
    }

private var _taxPound: ImageVector? = null
