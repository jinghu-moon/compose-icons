package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BracketsContainEnd: ImageVector
    get() {
        if (_bracketsContainEnd != null) return _bracketsContainEnd!!
        _bracketsContainEnd = tablerOutlineIcon(
            name = "BracketsContainEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 4h4v16h-4")
            addPathData("M5 16h.01")
            addPathData("M9 16h.01")
            addPathData("M13 16h.01")
        }
        return _bracketsContainEnd!!
    }

private var _bracketsContainEnd: ImageVector? = null
