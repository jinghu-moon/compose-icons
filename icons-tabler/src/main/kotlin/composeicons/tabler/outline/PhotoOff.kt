package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoOff: ImageVector
    get() {
        if (_photoOff != null) return _photoOff!!
        _photoOff = tablerOutlineIcon(
            name = "PhotoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M7 3h11c1.657 0 3 1.343 3 3v11M20.144 20.099c-.564 .577-1.337 .902-2.144 .901h-12C4.343 21 3 19.657 3 18v-12C3 5.155 3.349 4.392 3.91 3.847")
            addPathData("M3 16 8 11c.928-.893 2.072-.893 3 0l5 5")
            addPathData("M16.33 12.338c.574-.054 1.155 .166 1.67 .662l3 3")
            addPathData("M3 3 21 21")
        }
        return _photoOff!!
    }

private var _photoOff: ImageVector? = null
