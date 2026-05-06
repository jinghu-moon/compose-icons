package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShirtOff: ImageVector
    get() {
        if (_shirtOff != null) return _shirtOff!!
        _shirtOff = tablerOutlineIcon(
            name = "ShirtOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.243 4.252 9 4c0 .43 .09 .837 .252 1.206M10.647 6.678c.93 .47 2.037 .424 2.925-.122C14.46 6.01 15 5.042 15 4l6 2v5h-3v3M18 18v1c0 .552-.448 1-1 1h-10C6.448 20 6 19.552 6 19v-8h-3v-5L5.26 5.247")
            addPathData("M3 3 21 21")
        }
        return _shirtOff!!
    }

private var _shirtOff: ImageVector? = null
