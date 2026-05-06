package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapLock: ImageVector
    get() {
        if (_mapLock != null) return _mapLock!!
        _mapLock = tablerOutlineIcon(
            name = "MapLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M13.004 21.216c-.784 .455-1.776 .325-2.417-.316L6.343 16.657C3.219 13.533 3.219 8.467 6.343 5.343c3.124-3.124 8.19-3.124 11.314 0C19.164 6.839 20.008 8.877 20 11")
            addPathData("M17 19c0-.552 .448-1 1-1h3c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-3c-.552 0-1-.448-1-1v-2")
            addPathData("M18 18v-1.5C18 15.672 18.672 15 19.5 15c.828 0 1.5 .672 1.5 1.5v1.5")
        }
        return _mapLock!!
    }

private var _mapLock: ImageVector? = null
