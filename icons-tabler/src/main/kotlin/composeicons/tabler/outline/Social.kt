package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Social: ImageVector
    get() {
        if (_social != null) return _social!!
        _social = tablerOutlineIcon(
            name = "Social",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2")
            addPathData("M3 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2")
            addPathData("M17 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M9 14c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M12 7v4")
            addPathData("M6.7 17.8 9.5 15.8")
            addPathData("M17.3 17.8 14.5 15.8")
        }
        return _social!!
    }

private var _social: ImageVector? = null
