package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CreativeCommonsOff: ImageVector
    get() {
        if (_creativeCommonsOff != null) return _creativeCommonsOff!!
        _creativeCommonsOff = tablerOutlineIcon(
            name = "CreativeCommonsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.638 5.634C2.122 9.147 2.12 14.846 5.633 18.362c3.513 3.516 9.212 3.518 12.728 .005M20.047 16.035C21.79 12.566 21.112 8.37 18.365 5.627 15.617 2.883 11.421 2.211 7.954 3.958")
            addPathData("M10.5 10.5C9.641 9.791 8.386 9.841 7.586 10.616c-.374 .363-.586 .862-.586 1.384 0 .522 .211 1.021 .586 1.384 .8 .775 2.055 .825 2.914 .116")
            addPathData("M16.5 10.5c-.648-.535-1.545-.652-2.309-.302")
            addPathData("M3 3 21 21")
        }
        return _creativeCommonsOff!!
    }

private var _creativeCommonsOff: ImageVector? = null
