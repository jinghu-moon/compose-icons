package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Swimming: ImageVector
    get() {
        if (_swimming != null) return _swimming!!
        _swimming = tablerOutlineIcon(
            name = "Swimming",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C17 8.448 16.552 8 16 8c-.552 0-1 .448-1 1")
            addPathData("M6 11 10 9l3.5 3L12 14")
            addPathData("M3 16.75c.311 .155 .652 .24 1 .25 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .348-.01 .689-.095 1-.25")
        }
        return _swimming!!
    }

private var _swimming: ImageVector? = null
