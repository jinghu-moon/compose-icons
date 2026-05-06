package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScaleOutlineOff: ImageVector
    get() {
        if (_scaleOutlineOff != null) return _scaleOutlineOff!!
        _scaleOutlineOff = tablerOutlineIcon(
            name = "ScaleOutlineOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h10c2.209 0 4 1.791 4 4v10M19.827 19.83C19.078 20.58 18.06 21.001 17 21h-10C4.791 21 3 19.209 3 17v-10C3 5.896 3.447 4.897 4.17 4.173")
            addPathData("M11.062 7.062C11.372 7.021 11.684 7 12 7c1.956 0 3.724 .802 5 2.095-.673 .629-1.339 1.264-2 1.905M11.277 11.288c-.491 .122-.944 .366-1.315 .71L7.006 9.095c.346-.354 .729-.669 1.142-.942")
            addPathData("M3 3 21 21")
        }
        return _scaleOutlineOff!!
    }

private var _scaleOutlineOff: ImageVector? = null
