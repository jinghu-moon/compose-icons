package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Swipe: ImageVector
    get() {
        if (_swipe != null) return _swipe!!
        _swipe = tablerOutlineIcon(
            name = "Swipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 16.572v2.42c-.001 1.109-.9 2.007-2.009 2.008h-7.981C3.9 21 3.001 20.101 3 18.991v-7.981C3 9.9 3.899 9.001 5.009 9h2.954")
            addPathData("M9.167 4.511C9.459 3.425 10.576 2.78 11.663 3.07l7.826 2.097c1.086 .292 1.731 1.409 1.441 2.496l-2.097 7.826c-.292 1.086-1.409 1.731-2.496 1.441L8.51 14.833C7.424 14.541 6.779 13.424 7.069 12.337L9.167 4.51v.001")
        }
        return _swipe!!
    }

private var _swipe: ImageVector? = null
