package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BreadOff: ImageVector
    get() {
        if (_breadOff != null) return _breadOff!!
        _breadOff = tablerOutlineIcon(
            name = "BreadOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4l10 .005v-.005c1.243 0 2.358 .768 2.801 1.929 .444 1.161 .125 2.476-.801 3.306v6.765M19.41 19.418C19.05 19.778 18.55 20 18 20h-12C4.895 20 4 19.105 4 18v-8.764C3.295 8.606 2.929 7.681 3.011 6.739 3.094 5.797 3.615 4.949 4.418 4.451")
            addPathData("M3 3 21 21")
        }
        return _breadOff!!
    }

private var _breadOff: ImageVector? = null
