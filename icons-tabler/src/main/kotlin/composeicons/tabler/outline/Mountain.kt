package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mountain: ImageVector
    get() {
        if (_mountain != null) return _mountain!!
        _mountain = tablerOutlineIcon(
            name = "Mountain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 20h18L14.079 5.388C13.699 4.584 12.889 4.072 12 4.072c-.889 0-1.699 .513-2.079 1.316L3 20")
            addPathData("M7.5 11l2 2.5L12 11l2 3 2.5-2")
        }
        return _mountain!!
    }

private var _mountain: ImageVector? = null
