package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Chalkboard: ImageVector
    get() {
        if (_chalkboard != null) return _chalkboard!!
        _chalkboard = tablerOutlineIcon(
            name = "Chalkboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 19h-3C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v11c0 .552-.448 1-1 1")
            addPathData("M11 17c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-1")
        }
        return _chalkboard!!
    }

private var _chalkboard: ImageVector? = null
