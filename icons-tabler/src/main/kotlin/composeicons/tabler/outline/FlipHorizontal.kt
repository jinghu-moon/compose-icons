package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = tablerOutlineIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h18")
            addPathData("M7 16h10L7 21v-5")
            addPathData("M7 8h10L7 3v5")
        }
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
