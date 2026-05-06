package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SpiralOff: ImageVector
    get() {
        if (_spiralOff != null) return _spiralOff!!
        _spiralOff = tablerOutlineIcon(
            name = "SpiralOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12.057c.137 .296 .349 .552 .614 .743 .682 .459 1.509 .374 2.164-.02M13.881 9.86C13.619 8.955 12.982 8.206 12.132 7.801c-.164-.078-.333-.143-.507-.195M8.24 8.24C7.656 8.662 7.192 9.23 6.893 9.886c-1.095 2.432 .29 5.248 2.71 6.246 1.955 .806 4.097 .35 5.65-.884M16.998 12.98l.043-.103C18.401 9.534 16.484 5.743 13.145 4.467 11.552 3.857 9.875 3.868 8.355 4.354M5.776 5.762C4.762 6.591 3.981 7.669 3.508 8.89c-1.63 4.253 .823 9.024 5.082 10.576 3.211 1.17 6.676 .342 9.124-1.738M19.583 15.579c.852-1.359 1.34-2.914 1.417-4.516")
            addPathData("M3 3 21 21")
        }
        return _spiralOff!!
    }

private var _spiralOff: ImageVector? = null
