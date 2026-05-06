package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoCancel: ImageVector
    get() {
        if (_photoCancel != null) return _photoCancel!!
        _photoCancel = tablerOutlineIcon(
            name = "PhotoCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M12.5 21h-6.5C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v6.5")
            addPathData("M3 16 8 11c.928-.893 2.072-.893 3 0l3 3")
            addPathData("M14 14l1-1c.616-.593 1.328-.792 2.008-.598")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 21l4-4")
        }
        return _photoCancel!!
    }

private var _photoCancel: ImageVector? = null
