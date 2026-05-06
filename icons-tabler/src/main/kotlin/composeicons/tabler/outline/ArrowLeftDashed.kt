package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLeftDashed: ImageVector
    get() {
        if (_arrowLeftDashed != null) return _arrowLeftDashed!!
        _arrowLeftDashed = tablerOutlineIcon(
            name = "ArrowLeftDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h6M14 12h1.5M18.5 12h.5")
            addPathData("M5 12l6 6")
            addPathData("M5 12 11 6")
        }
        return _arrowLeftDashed!!
    }

private var _arrowLeftDashed: ImageVector? = null
