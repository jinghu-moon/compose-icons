package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RotateDot: ImageVector
    get() {
        if (_rotateDot != null) return _rotateDot!!
        _rotateDot = tablerOutlineIcon(
            name = "RotateDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.95 11C19.427 7.009 16.019 4.028 11.994 4.04 7.968 4.052 4.579 7.053 4.08 11.047c-.499 3.994 2.047 7.738 5.946 8.74 3.899 1.003 7.935-1.048 9.425-4.788M19.95 20v-5h-5")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _rotateDot!!
    }

private var _rotateDot: ImageVector? = null
