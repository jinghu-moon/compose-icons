package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BorderStyle2: ImageVector
    get() {
        if (_borderStyle2 != null) return _borderStyle2!!
        _borderStyle2 = tablerOutlineIcon(
            name = "BorderStyle2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18v.01")
            addPathData("M8 18v.01")
            addPathData("M12 18v.01")
            addPathData("M16 18v.01")
            addPathData("M20 18v.01")
            addPathData("M18 12h2")
            addPathData("M11 12h2")
            addPathData("M4 12h2")
            addPathData("M4 6h16")
        }
        return _borderStyle2!!
    }

private var _borderStyle2: ImageVector? = null
