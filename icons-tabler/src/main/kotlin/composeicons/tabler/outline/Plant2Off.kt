package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Plant2Off: ImageVector
    get() {
        if (_plant2Off != null) return _plant2Off!!
        _plant2Off = tablerOutlineIcon(
            name = "Plant2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 9c0 5.523 4.477 10 10 10 1.922 .003 3.804-.55 5.418-1.593M19.555 15.552C21.135 13.735 22.004 11.408 22 9")
            addPathData("M12 19c0-1.988 .58-3.84 1.58-5.397M15.458 11.436C17.273 9.861 19.597 8.996 22 9")
            addPathData("M2 9c5.523 0 10 4.477 10 10")
            addPathData("M12 4c1.916 1.83 3 4.364 3 7.013")
            addPathData("M9.01 11.5c-.039-.776 .016-1.555 .163-2.318M10.255 6.24C10.724 5.412 11.312 4.657 12 4")
            addPathData("M3 3 21 21")
        }
        return _plant2Off!!
    }

private var _plant2Off: ImageVector? = null
