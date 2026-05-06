package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number4Small: ImageVector
    get() {
        if (_number4Small != null) return _number4Small!!
        _number4Small = tablerOutlineIcon(
            name = "Number4Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8v3c0 .552 .448 1 1 1h3")
            addPathData("M14 8v8")
        }
        return _number4Small!!
    }

private var _number4Small: ImageVector? = null
