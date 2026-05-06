package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToolsKitchen2Off: ImageVector
    get() {
        if (_toolsKitchen2Off != null) return _toolsKitchen2Off!!
        _toolsKitchen2Off = tablerOutlineIcon(
            name = "ToolsKitchen2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.386 10.409C14.916 8.129 16.152 5.717 19 3v12M15 15h-1c0-.313 0-.627 0-.941")
            addPathData("M19 19v2h-1v-3")
            addPathData("M8 8v13")
            addPathData("M5 5v2c-0 1.082 .581 2.08 1.523 2.612 .941 .533 2.096 .517 3.023-.04M11 7v-3")
            addPathData("M3 3 21 21")
        }
        return _toolsKitchen2Off!!
    }

private var _toolsKitchen2Off: ImageVector? = null
