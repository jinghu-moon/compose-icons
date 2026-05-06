package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerUp: ImageVector
    get() {
        if (_pointerUp != null) return _pointerUp!!
        _pointerUp = tablerOutlineIcon(
            name = "PointerUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.984 13.428 14.778 12.222l3.113-2.09c.441-.238 .688-.725 .62-1.221-.069-.497-.439-.898-.929-1.007L4 4 7.904 17.563c.109 .489 .51 .859 1.007 .928 .497 .069 .983-.179 1.221-.62l2.09-3.093 1.217 1.217")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _pointerUp!!
    }

private var _pointerUp: ImageVector? = null
