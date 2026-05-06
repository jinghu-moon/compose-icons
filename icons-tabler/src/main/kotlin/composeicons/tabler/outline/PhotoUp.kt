package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoUp: ImageVector
    get() {
        if (_photoUp != null) return _photoUp!!
        _photoUp = tablerOutlineIcon(
            name = "PhotoUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M12.5 21h-6.5C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v6.5")
            addPathData("M3 16 8 11c.928-.893 2.072-.893 3 0l3.5 3.5")
            addPathData("M14 14l1-1c.679-.653 1.473-.829 2.214-.526")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _photoUp!!
    }

private var _photoUp: ImageVector? = null
