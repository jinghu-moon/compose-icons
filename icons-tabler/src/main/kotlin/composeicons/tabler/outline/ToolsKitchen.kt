package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToolsKitchen: ImageVector
    get() {
        if (_toolsKitchen != null) return _toolsKitchen!!
        _toolsKitchen = tablerOutlineIcon(
            name = "ToolsKitchen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3h8l-1 9h-6L4 3")
            addPathData("M7 18h2v3h-2v-3")
            addPathData("M20 3v12h-5c-.023-3.681 .184-7.406 5-12")
            addPathData("M20 15v6h-1v-3")
            addPathData("M8 12v6")
        }
        return _toolsKitchen!!
    }

private var _toolsKitchen: ImageVector? = null
