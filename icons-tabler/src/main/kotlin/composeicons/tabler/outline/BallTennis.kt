package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BallTennis: ImageVector
    get() {
        if (_ballTennis != null) return _ballTennis!!
        _ballTennis = tablerOutlineIcon(
            name = "BallTennis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M6 5.3C7.903 7.007 8.991 9.443 8.991 12c0 2.557-1.087 4.993-2.991 6.7")
            addPathData("M18 5.3C16.097 7.007 15.009 9.443 15.009 12c0 2.557 1.087 4.993 2.991 6.7")
        }
        return _ballTennis!!
    }

private var _ballTennis: ImageVector? = null
