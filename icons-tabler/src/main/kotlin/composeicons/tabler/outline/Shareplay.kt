package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Shareplay: ImageVector
    get() {
        if (_shareplay != null) return _shareplay!!
        _shareplay = tablerOutlineIcon(
            name = "Shareplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 18c1.657 0 3-1.343 3-3v-8C21 5.343 19.657 4 18 4h-12C4.343 4 3 5.343 3 7v8c0 1.657 1.343 3 3 3")
            addPathData("M9 20h6L12 15 9 20")
        }
        return _shareplay!!
    }

private var _shareplay: ImageVector? = null
