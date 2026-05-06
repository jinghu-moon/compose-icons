package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoExclamation: ImageVector
    get() {
        if (_photoExclamation != null) return _photoExclamation!!
        _photoExclamation = tablerOutlineIcon(
            name = "PhotoExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M15 21h-9C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v6")
            addPathData("M3 16 8 11c.928-.893 2.072-.893 3 0l4 4")
            addPathData("M14 14l1-1c.665-.64 1.44-.821 2.167-.545")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _photoExclamation!!
    }

private var _photoExclamation: ImageVector? = null
