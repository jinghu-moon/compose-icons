package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pillow: ImageVector
    get() {
        if (_pillow != null) return _pillow!!
        _pillow = tablerOutlineIcon(
            name = "Pillow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 9c.66 1.946 .66 4.054 0 6")
            addPathData("M21.699 16.607c.481 .934 .28 2.088-.486 2.79-.767 .703-1.9 .77-2.74 .165-4.296 .585-8.65 .585-12.946 0-.835 .607-1.984 .538-2.74-.165-.769-.716-.967-1.856-.486-2.79-.337-3.045-.337-6.118 0-9.163C1.773 6.505 1.951 5.328 2.734 4.588c.77-.726 1.952-.787 2.793-.145 4.296-.585 8.65-.585 12.946 0 .841-.642 2.023-.581 2.793 .145 .78 .726 .961 1.918 .433 2.856 .337 3.045 .337 6.118 0 9.163")
        }
        return _pillow!!
    }

private var _pillow: ImageVector? = null
