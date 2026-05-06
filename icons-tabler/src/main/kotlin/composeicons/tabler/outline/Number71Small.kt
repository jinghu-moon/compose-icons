package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number71Small: ImageVector
    get() {
        if (_number71Small != null) return _number71Small!!
        _number71Small = tablerOutlineIcon(
            name = "Number71Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h1v8")
            addPathData("M7 8h4L9 16")
        }
        return _number71Small!!
    }

private var _number71Small: ImageVector? = null
