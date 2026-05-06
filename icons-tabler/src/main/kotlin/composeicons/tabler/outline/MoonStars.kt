package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = tablerOutlineIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c.132 0 .263 0 .393 0C9.742 5.463 9.228 9.468 11.171 12.521c1.943 3.053 5.788 4.283 9.142 2.925-1.733 4.169-6.286 6.409-10.646 5.238C5.306 19.512 2.489 15.291 3.079 10.815 3.67 6.339 7.485 2.993 12 2.992v.008")
            addPathData("M17 4c0 1.105 .895 2 2 2-1.105 0-2 .895-2 2C17 6.895 16.105 6 15 6c1.105 0 2-.895 2-2")
            addPathData("M19 11h2M20 10v2")
        }
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
