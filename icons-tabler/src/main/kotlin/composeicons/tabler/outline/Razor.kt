package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Razor: ImageVector
    get() {
        if (_razor != null) return _razor!!
        _razor = tablerOutlineIcon(
            name = "Razor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h10v4h-10v-4")
            addPathData("M12 7v4")
            addPathData("M12 11c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-6c0-1.105 .895-2 2-2")
        }
        return _razor!!
    }

private var _razor: ImageVector? = null
