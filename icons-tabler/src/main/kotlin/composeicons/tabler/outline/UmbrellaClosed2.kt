package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UmbrellaClosed2: ImageVector
    get() {
        if (_umbrellaClosed2 != null) return _umbrellaClosed2!!
        _umbrellaClosed2 = tablerOutlineIcon(
            name = "UmbrellaClosed2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.697 12.071 18.01 5 10.94 16.314 6.697 12.071")
            addPathData("M8.743 14.475 6.622 16.596c-1.886 1.886 .943 4.715 2.828 2.829")
        }
        return _umbrellaClosed2!!
    }

private var _umbrellaClosed2: ImageVector? = null
