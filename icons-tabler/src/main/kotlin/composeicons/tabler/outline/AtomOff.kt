package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AtomOff: ImageVector
    get() {
        if (_atomOff != null) return _atomOff!!
        _atomOff = tablerOutlineIcon(
            name = "AtomOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v.01")
            addPathData("M9.172 9.172C5.266 13.077 3.367 17.509 4.929 19.072c1.562 1.561 6-.338 9.9-4.244M16.713 12.715C19.3 9.438 20.355 6.213 19.071 4.929 17.787 3.645 14.563 4.699 11.287 7.286")
            addPathData("M4.929 4.929c-1.562 1.562 .337 6 4.243 9.9 3.905 3.905 8.337 5.804 9.9 4.242M19 15C18.233 13.206 16.785 11.128 14.828 9.172 12.884 7.227 10.787 5.77 9 5")
            addPathData("M3 3 21 21")
        }
        return _atomOff!!
    }

private var _atomOff: ImageVector? = null
