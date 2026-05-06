package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathSymbols: ImageVector
    get() {
        if (_mathSymbols != null) return _mathSymbols!!
        _mathSymbols = tablerOutlineIcon(
            name = "MathSymbols",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h18")
            addPathData("M12 3v18")
            addPathData("M16.5 4.5l3 3")
            addPathData("M19.5 4.5l-3 3")
            addPathData("M6 4v4")
            addPathData("M4 6h4")
            addPathData("M18 16h.01")
            addPathData("M18 20h.01")
            addPathData("M4 18h4")
        }
        return _mathSymbols!!
    }

private var _mathSymbols: ImageVector? = null
