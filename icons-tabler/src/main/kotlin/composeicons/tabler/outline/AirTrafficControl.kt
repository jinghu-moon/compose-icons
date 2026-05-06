package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = tablerOutlineIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 3h2")
            addPathData("M12 3v3")
            addPathData("M5.998 6h12.004c.632-0 1.228 .299 1.605 .806 .377 .507 .493 1.163 .311 1.769l-1.8 6c-.254 .846-1.033 1.425-1.916 1.425h-8.404c-.883 0-1.662-.579-1.916-1.425l-1.8-6C3.9 7.969 4.016 7.313 4.393 6.806 4.77 6.299 5.366 6 5.998 6")
            addPathData("M8.5 6 10 16v5")
            addPathData("M15.5 6 14 16v5")
        }
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
