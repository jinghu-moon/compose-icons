package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowNarrowLeftDashed: ImageVector
    get() {
        if (_arrowNarrowLeftDashed != null) return _arrowNarrowLeftDashed!!
        _arrowNarrowLeftDashed = tablerOutlineIcon(
            name = "ArrowNarrowLeftDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h6M14 12h1.5M18.5 12h.5")
            addPathData("M5 12l4 4")
            addPathData("M5 12 9 8")
        }
        return _arrowNarrowLeftDashed!!
    }

private var _arrowNarrowLeftDashed: ImageVector? = null
