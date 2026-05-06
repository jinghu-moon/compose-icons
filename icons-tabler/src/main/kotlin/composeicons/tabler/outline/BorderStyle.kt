package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BorderStyle: ImageVector
    get() {
        if (_borderStyle != null) return _borderStyle!!
        _borderStyle = tablerOutlineIcon(
            name = "BorderStyle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20v-14C4 4.895 4.895 4 6 4h14")
            addPathData("M20 8v.01")
            addPathData("M20 12v.01")
            addPathData("M20 16v.01")
            addPathData("M8 20v.01")
            addPathData("M12 20v.01")
            addPathData("M16 20v.01")
            addPathData("M20 20v.01")
        }
        return _borderStyle!!
    }

private var _borderStyle: ImageVector? = null
