package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowNarrowRightDashed: ImageVector
    get() {
        if (_arrowNarrowRightDashed != null) return _arrowNarrowRightDashed!!
        _arrowNarrowRightDashed = tablerOutlineIcon(
            name = "ArrowNarrowRightDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h.5M8.5 12h1.5M13 12h6")
            addPathData("M15 16l4-4")
            addPathData("M15 8l4 4")
        }
        return _arrowNarrowRightDashed!!
    }

private var _arrowNarrowRightDashed: ImageVector? = null
