package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathXMinusX: ImageVector
    get() {
        if (_mathXMinusX != null) return _mathXMinusX!!
        _mathXMinusX = tablerOutlineIcon(
            name = "MathXMinusX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 9l6 6")
            addPathData("M2 15 8 9")
            addPathData("M16 9l6 6")
            addPathData("M16 15 22 9")
            addPathData("M10 12h4")
        }
        return _mathXMinusX!!
    }

private var _mathXMinusX: ImageVector? = null
