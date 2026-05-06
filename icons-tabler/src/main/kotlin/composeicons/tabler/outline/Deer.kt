package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Deer: ImageVector
    get() {
        if (_deer != null) return _deer!!
        _deer = tablerOutlineIcon(
            name = "Deer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3C3 5 4 6 7 6c2 0 3 1 3 3")
            addPathData("M21 3c0 2-1 3-4 3-2 0-3 .333-3 3")
            addPathData("M12 18C11 18 8 15 8 12 8 10 9.333 9 12 9c2.667 0 4 1 4 3 0 3-3 6-4 6")
            addPathData("M15.185 14.889l.095-.18c1.161 1.663 .893 3.931-.622 5.279-1.516 1.347-3.8 1.347-5.315 0C7.827 18.64 7.559 16.372 8.72 14.709")
            addPathData("M17 3c0 1.333-.333 2.333-1 3")
            addPathData("M7 3c0 1.333 .333 2.333 1 3")
            addPathData("M7 6C4.333 6.667 2.667 7.667 2 9")
            addPathData("M17 6c2.667 .667 4.333 1.667 5 3")
            addPathData("M8.5 10 7 9")
            addPathData("M15.5 10 17 9")
            addPathData("M12 15h.01")
        }
        return _deer!!
    }

private var _deer: ImageVector? = null
