package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UfoOff: ImageVector
    get() {
        if (_ufoOff != null) return _ufoOff!!
        _ufoOff = tablerOutlineIcon(
            name = "UfoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.95 9.01C19.97 9.749 22 11.133 22 12.724c0 1.08-.931 2.063-2.468 2.814M16.532 16.538C15.172 16.833 13.632 17 12.001 17 6.481 17 2.001 15.091 2.001 12.724 2.001 11.134 4.041 9.739 7.071 9")
            addPathData("M14.69 10.686C16.078 10.331 17 9.71 17 9v-.035C17 6.223 14.761 4 12 4 10.875 4 9.836 4.37 9 4.992M7.293 7.289C7.099 7.826 7 8.394 7 8.965v.035c0 .961 1.696 1.764 3.956 1.956")
            addPathData("M15 17l2 3")
            addPathData("M8.5 17 7 20")
            addPathData("M12 14h.01")
            addPathData("M7 13h.01")
            addPathData("M17 13h.01")
            addPathData("M3 3 21 21")
        }
        return _ufoOff!!
    }

private var _ufoOff: ImageVector? = null
