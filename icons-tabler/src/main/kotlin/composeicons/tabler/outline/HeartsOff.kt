package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartsOff: ImageVector
    get() {
        if (_heartsOff != null) return _heartsOff!!
        _heartsOff = tablerOutlineIcon(
            name = "HeartsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.017 18 12 20 4.5 12.572C3.452 11.552 2.903 10.125 2.997 8.666 3.091 7.207 3.82 5.862 4.99 4.986M8 3.986c1.577 .004 3.06 .752 4 2.018C13.627 3.838 16.682 3.362 18.891 4.929c2.209 1.567 2.769 4.608 1.262 6.859")
            addPathData("M11.814 11.814c-1.082 1.092-1.085 2.852-.007 3.948L15.989 20l2.01-2.021M19.976 15.989l.211-.212c1.08-1.094 1.08-2.854 0-3.948-.515-.524-1.219-.819-1.954-.821-.735-.001-1.439 .292-1.956 .814L15.994 12")
            addPathData("M3 3 21 21")
        }
        return _heartsOff!!
    }

private var _heartsOff: ImageVector? = null
