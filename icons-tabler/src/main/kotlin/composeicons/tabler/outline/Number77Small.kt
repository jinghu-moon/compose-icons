package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number77Small: ImageVector
    get() {
        if (_number77Small != null) return _number77Small!!
        _number77Small = tablerOutlineIcon(
            name = "Number77Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8h4l-2 8")
            addPathData("M6 8h4L8 16")
        }
        return _number77Small!!
    }

private var _number77Small: ImageVector? = null
