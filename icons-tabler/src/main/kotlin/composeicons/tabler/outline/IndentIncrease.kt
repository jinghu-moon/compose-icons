package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IndentIncrease: ImageVector
    get() {
        if (_indentIncrease != null) return _indentIncrease!!
        _indentIncrease = tablerOutlineIcon(
            name = "IndentIncrease",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 6h-11")
            addPathData("M20 12h-7")
            addPathData("M20 18h-11")
            addPathData("M4 8l4 4L4 16")
        }
        return _indentIncrease!!
    }

private var _indentIncrease: ImageVector? = null
