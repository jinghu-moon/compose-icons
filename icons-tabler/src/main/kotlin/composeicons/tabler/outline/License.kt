package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.License: ImageVector
    get() {
        if (_license != null) return _license!!
        _license = tablerOutlineIcon(
            name = "License",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 21h-9C4.343 21 3 19.657 3 18v-1h10v2c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-14c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2M19 3h-11C6.343 3 5 4.343 5 6v11")
            addPathData("M9 7h4")
            addPathData("M9 11h4")
        }
        return _license!!
    }

private var _license: ImageVector? = null
