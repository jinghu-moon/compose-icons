package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerBolt: ImageVector
    get() {
        if (_pointerBolt != null) return _pointerBolt!!
        _pointerBolt = tablerOutlineIcon(
            name = "PointerBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.044 13.488 14.778 12.222l3.113-2.09c.441-.238 .688-.725 .62-1.221-.069-.497-.439-.898-.929-1.007L4 4 7.904 17.563c.109 .489 .51 .859 1.007 .928 .497 .069 .983-.179 1.221-.62l2.09-3.093 1.678 1.678")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _pointerBolt!!
    }

private var _pointerBolt: ImageVector? = null
