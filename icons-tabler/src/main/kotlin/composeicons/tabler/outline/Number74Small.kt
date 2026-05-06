package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number74Small: ImageVector
    get() {
        if (_number74Small != null) return _number74Small!!
        _number74Small = tablerOutlineIcon(
            name = "Number74Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8v3c0 .552 .448 1 1 1h3")
            addPathData("M18 8v8")
            addPathData("M6 8h4L8 16")
        }
        return _number74Small!!
    }

private var _number74Small: ImageVector? = null
