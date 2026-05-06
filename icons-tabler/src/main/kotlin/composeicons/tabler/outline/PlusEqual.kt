package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlusEqual: ImageVector
    get() {
        if (_plusEqual != null) return _plusEqual!!
        _plusEqual = tablerOutlineIcon(
            name = "PlusEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7h6")
            addPathData("M7 4v6")
            addPathData("M20 16h-6")
            addPathData("M20 19h-6")
            addPathData("M5 19 19 5")
        }
        return _plusEqual!!
    }

private var _plusEqual: ImageVector? = null
