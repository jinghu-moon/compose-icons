package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = tablerOutlineIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.718 20.713C9.372 21.659 5.808 20.226 4.049 17.226 2.29 14.226 2.779 10.417 5.238 7.958l.72-.72C8.368 4.828 12.081 4.305 15.063 5.955L17.45 3.61c.79-.783 2.055-.806 2.873-.053 .818 .753 .899 2.016 .184 2.868l-.116 .126L18.045 8.938c1.59 2.874 1.167 6.442-1.052 8.864")
            addPathData("M11 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M9.3 5.3l9.4 9.4")
        }
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
