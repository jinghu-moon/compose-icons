package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BallFootballOff: ImageVector
    get() {
        if (_ballFootballOff != null) return _ballFootballOff!!
        _ballFootballOff = tablerOutlineIcon(
            name = "BallFootballOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.041 16.046C21.789 12.578 21.116 8.379 18.37 5.632 15.624 2.885 11.426 2.209 7.957 3.956M5.634 5.639C2.119 9.153 2.118 14.852 5.632 18.367c3.514 3.515 9.213 3.516 12.728 .002")
            addPathData("M12 7l4.755 3.455-.566 1.743-.98 3.014L15 16h-6L7.245 10.455 9.105 9.104 11.418 7.423 12 7")
            addPathData("M12 7v-4")
            addPathData("M15 16l2.5 3")
            addPathData("M16.755 10.455 20.5 9")
            addPathData("M9.061 16.045 6.5 19")
            addPathData("M7.245 10.455 3.5 9")
            addPathData("M3 3 21 21")
        }
        return _ballFootballOff!!
    }

private var _ballFootballOff: ImageVector? = null
