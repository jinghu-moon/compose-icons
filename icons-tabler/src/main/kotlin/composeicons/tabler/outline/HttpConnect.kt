package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpConnect: ImageVector
    get() {
        if (_httpConnect != null) return _httpConnect!!
        _httpConnect = tablerOutlineIcon(
            name = "HttpConnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 10C7 8.895 6.105 8 5 8 3.895 8 3 8.895 3 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M17 16v-8l4 8v-8")
            addPathData("M12 8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2")
        }
        return _httpConnect!!
    }

private var _httpConnect: ImageVector? = null
