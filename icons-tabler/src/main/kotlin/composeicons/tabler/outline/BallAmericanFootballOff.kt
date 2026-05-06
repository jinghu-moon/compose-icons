package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BallAmericanFootballOff: ImageVector
    get() {
        if (_ballAmericanFootballOff != null) return _ballAmericanFootballOff!!
        _ballAmericanFootballOff = tablerOutlineIcon(
            name = "BallAmericanFootballOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 9l-1 1M12 12 9 15")
            addPathData("M10 12l2 2")
            addPathData("M8 21C8 18.239 5.761 16 3 16")
            addPathData("M6.813 6.802C4.368 9.238 2.996 12.549 3 16c0 2.761 2.239 5 5 5 3.446 .004 6.751-1.363 9.186-3.801M18.975 14.972C20.301 12.889 21.004 10.47 21 8 21 5.239 18.761 3 16 3 13.532 2.996 11.115 3.697 9.033 5.022")
            addPathData("M16 3c0 2.761 2.239 5 5 5")
            addPathData("M3 3 21 21")
        }
        return _ballAmericanFootballOff!!
    }

private var _ballAmericanFootballOff: ImageVector? = null
