package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerCog: ImageVector
    get() {
        if (_pointerCog != null) return _pointerCog!!
        _pointerCog = tablerOutlineIcon(
            name = "PointerCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.774 13.218l-.996-.996 3.113-2.09c.441-.238 .688-.725 .62-1.221-.069-.497-.439-.898-.929-1.007L4 4 7.904 17.563c.109 .489 .51 .859 1.007 .928 .497 .069 .983-.179 1.221-.62l2.09-3.093 .343 .343")
            addPathData("M17.001 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M19.001 15.5v1.5")
            addPathData("M19.001 21v1.5")
            addPathData("M22.032 17.25 20.733 18")
            addPathData("M17.27 20l-1.3 .75")
            addPathData("M15.97 17.25 17.27 18")
            addPathData("M20.733 20l1.3 .75")
        }
        return _pointerCog!!
    }

private var _pointerCog: ImageVector? = null
