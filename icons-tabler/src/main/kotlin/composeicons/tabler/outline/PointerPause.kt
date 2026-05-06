package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerPause: ImageVector
    get() {
        if (_pointerPause != null) return _pointerPause!!
        _pointerPause = tablerOutlineIcon(
            name = "PointerPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.72 13.163l-.942-.941 3.113-2.09c.441-.238 .688-.725 .62-1.221-.069-.497-.439-.898-.929-1.007L4 4 7.904 17.563c.109 .489 .51 .859 1.007 .928 .497 .069 .983-.179 1.221-.62l2.09-3.093 .969 .969")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _pointerPause!!
    }

private var _pointerPause: ImageVector? = null
