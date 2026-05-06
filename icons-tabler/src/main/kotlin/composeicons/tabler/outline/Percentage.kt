package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Percentage: ImageVector
    get() {
        if (_percentage != null) return _percentage!!
        _percentage = tablerOutlineIcon(
            name = "Percentage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 17c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M6 7c0 .552 .448 1 1 1C7.552 8 8 7.552 8 7 8 6.448 7.552 6 7 6 6.448 6 6 6.448 6 7")
            addPathData("M6 18 18 6")
        }
        return _percentage!!
    }

private var _percentage: ImageVector? = null
