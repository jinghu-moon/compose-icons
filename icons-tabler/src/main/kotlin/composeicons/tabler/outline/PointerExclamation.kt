package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerExclamation: ImageVector
    get() {
        if (_pointerExclamation != null) return _pointerExclamation!!
        _pointerExclamation = tablerOutlineIcon(
            name = "PointerExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.97 13.414 14.778 12.222l3.113-2.09c.441-.238 .688-.725 .62-1.221-.069-.497-.439-.898-.929-1.007L4 4 7.904 17.563c.109 .489 .51 .859 1.007 .928 .497 .069 .983-.179 1.221-.62l2.09-3.093L15 17.556")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _pointerExclamation!!
    }

private var _pointerExclamation: ImageVector? = null
