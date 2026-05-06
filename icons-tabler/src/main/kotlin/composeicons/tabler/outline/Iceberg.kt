package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Iceberg: ImageVector
    get() {
        if (_iceberg != null) return _iceberg!!
        _iceberg = tablerOutlineIcon(
            name = "Iceberg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 10l-2 9-4 3L10 17 7 16 5 10 7 5 10 3l3 3 4 1 2 3")
            addPathData("M3 10h18")
        }
        return _iceberg!!
    }

private var _iceberg: ImageVector? = null
