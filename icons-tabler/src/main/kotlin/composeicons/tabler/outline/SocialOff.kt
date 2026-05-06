package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SocialOff: ImageVector
    get() {
        if (_socialOff != null) return _socialOff!!
        _socialOff = tablerOutlineIcon(
            name = "SocialOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2")
            addPathData("M3 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2")
            addPathData("M17.57 17.602c-.781 .781-.78 2.048 .002 2.829 .781 .781 2.048 .78 2.828-.001")
            addPathData("M11.113 11.133c-1.368 .424-2.245 1.755-2.096 3.179 .149 1.424 1.284 2.544 2.71 2.674 1.426 .13 2.745-.765 3.151-2.138")
            addPathData("M12 7v1")
            addPathData("M6.7 17.8 9.5 15.8")
            addPathData("M17.3 17.8 14.5 15.8")
            addPathData("M3 3 21 21")
        }
        return _socialOff!!
    }

private var _socialOff: ImageVector? = null
