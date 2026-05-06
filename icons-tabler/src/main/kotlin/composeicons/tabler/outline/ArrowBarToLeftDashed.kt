package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarToLeftDashed: ImageVector
    get() {
        if (_arrowBarToLeftDashed != null) return _arrowBarToLeftDashed!!
        _arrowBarToLeftDashed = tablerOutlineIcon(
            name = "ArrowBarToLeftDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h10")
            addPathData("M10 12 14 8")
            addPathData("M10 12l4 4")
            addPathData("M4 20v-3M4 4v3M4 10.5v3")
        }
        return _arrowBarToLeftDashed!!
    }

private var _arrowBarToLeftDashed: ImageVector? = null
