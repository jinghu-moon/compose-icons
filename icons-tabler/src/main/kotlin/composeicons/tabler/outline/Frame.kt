package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Frame: ImageVector
    get() {
        if (_frame != null) return _frame!!
        _frame = tablerOutlineIcon(
            name = "Frame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7h16")
            addPathData("M4 17h16")
            addPathData("M7 4v16")
            addPathData("M17 4v16")
        }
        return _frame!!
    }

private var _frame: ImageVector? = null
