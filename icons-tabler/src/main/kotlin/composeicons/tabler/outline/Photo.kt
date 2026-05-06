package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Photo: ImageVector
    get() {
        if (_photo != null) return _photo!!
        _photo = tablerOutlineIcon(
            name = "Photo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M3 6C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-12")
            addPathData("M3 16 8 11c.928-.893 2.072-.893 3 0l5 5")
            addPathData("M14 14l1-1c.928-.893 2.072-.893 3 0l3 3")
        }
        return _photo!!
    }

private var _photo: ImageVector? = null
