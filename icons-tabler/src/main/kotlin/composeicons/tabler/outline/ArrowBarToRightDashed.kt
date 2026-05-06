package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarToRightDashed: ImageVector
    get() {
        if (_arrowBarToRightDashed != null) return _arrowBarToRightDashed!!
        _arrowBarToRightDashed = tablerOutlineIcon(
            name = "ArrowBarToRightDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12h-10")
            addPathData("M14 12l-4 4")
            addPathData("M14 12 10 8")
            addPathData("M20 4v3M20 20v-3M20 13.5v-3")
        }
        return _arrowBarToRightDashed!!
    }

private var _arrowBarToRightDashed: ImageVector? = null
