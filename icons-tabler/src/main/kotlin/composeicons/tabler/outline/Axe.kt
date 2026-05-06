package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = tablerOutlineIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 9l7.383 7.418c.823 .82 .823 2.148 0 2.967-.823 .819-2.153 .819-2.976 0L10 12")
            addPathData("M6.66 15.66 3.34 12.34c-.297-.297-.425-.724-.34-1.135 .085-.411 .37-.753 .76-.909L7 9 13 3l3 3-6 6L8.704 15.24c-.156 .39-.498 .676-.909 .76-.411 .085-.838-.043-1.135-.34")
        }
        return _axe!!
    }

private var _axe: ImageVector? = null
