package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToolsKitchen3: ImageVector
    get() {
        if (_toolsKitchen3 != null) return _toolsKitchen3!!
        _toolsKitchen3 = tablerOutlineIcon(
            name = "ToolsKitchen3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 4v17M4 4v3c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-3")
            addPathData("M14 8c0 2.209 1.343 4 3 4 1.657 0 3-1.791 3-4C20 5.791 18.657 4 17 4 15.343 4 14 5.791 14 8")
            addPathData("M17 12v9")
        }
        return _toolsKitchen3!!
    }

private var _toolsKitchen3: ImageVector? = null
