package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WindOff: ImageVector
    get() {
        if (_windOff != null) return _windOff!!
        _windOff = tablerOutlineIcon(
            name = "WindOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 8h3M12 8h1.5c1.29 .025 2.386-.936 2.532-2.218C16.177 4.501 15.324 3.319 14.061 3.054c-1.262-.265-2.519 .474-2.901 1.706")
            addPathData("M3 12h9")
            addPathData("M16 12h2.5c1.024-.02 1.956 .587 2.353 1.53 .397 .944 .178 2.034-.552 2.752")
            addPathData("M4 16h5.5c1.29-.025 2.386 .936 2.532 2.218 .145 1.282-.708 2.464-1.971 2.729C8.799 21.211 7.542 20.472 7.16 19.24")
            addPathData("M3 3 21 21")
        }
        return _windOff!!
    }

private var _windOff: ImageVector? = null
