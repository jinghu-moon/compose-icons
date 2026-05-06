package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = tablerOutlineIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 6.84c.625 .362 1.006 1.032 1 1.754v6.555c0 .728-.394 1.4-1.03 1.753l-6 3.844c-.603 .336-1.337 .336-1.94 0L5.03 16.902C4.394 16.548 4 15.878 4 15.15v-6.557C4 7.865 4.394 7.194 5.03 6.84L11.03 3.258c.621-.347 1.379-.347 2 0l6 3.582h-.03")
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
        }
        return _nut!!
    }

private var _nut: ImageVector? = null
