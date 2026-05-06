package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Minimize: ImageVector
    get() {
        if (_minimize != null) return _minimize!!
        _minimize = tablerOutlineIcon(
            name = "Minimize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 19v-2c0-1.105 .895-2 2-2h2")
            addPathData("M15 5v2c0 1.105 .895 2 2 2h2")
            addPathData("M5 15h2c1.105 0 2 .895 2 2v2")
            addPathData("M5 9h2C8.105 9 9 8.105 9 7v-2")
        }
        return _minimize!!
    }

private var _minimize: ImageVector? = null
