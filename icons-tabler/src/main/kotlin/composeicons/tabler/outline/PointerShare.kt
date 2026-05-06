package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerShare: ImageVector
    get() {
        if (_pointerShare != null) return _pointerShare!!
        _pointerShare = tablerOutlineIcon(
            name = "PointerShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.646 13.09l-.868-.868 3.113-2.09c.441-.238 .688-.725 .62-1.221-.069-.497-.439-.898-.929-1.007L4 4 7.904 17.563c.109 .489 .51 .859 1.007 .928 .497 .069 .983-.179 1.221-.62l2.09-3.093 .607 .607")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _pointerShare!!
    }

private var _pointerShare: ImageVector? = null
