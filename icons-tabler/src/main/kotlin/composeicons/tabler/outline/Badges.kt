package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Badges: ImageVector
    get() {
        if (_badges != null) return _badges!!
        _badges = tablerOutlineIcon(
            name = "Badges",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 17v-4l-5 3L7 13v4l5 3 5-3")
            addPathData("M17 8v-4L12 7 7 4v4l5 3L17 8")
        }
        return _badges!!
    }

private var _badges: ImageVector? = null
