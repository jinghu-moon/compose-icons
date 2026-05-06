package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = tablerOutlineIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12C4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8h-16")
            addPathData("M12 12v6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
        }
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
