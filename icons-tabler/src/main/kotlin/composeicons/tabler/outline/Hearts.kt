package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hearts: ImageVector
    get() {
        if (_hearts != null) return _hearts!!
        _hearts = tablerOutlineIcon(
            name = "Hearts",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.017 18 12 20 4.5 12.572C3.151 11.26 2.654 9.301 3.212 7.504 3.771 5.707 5.292 4.376 7.147 4.06 9.002 3.743 10.877 4.496 12 6.006 13.627 3.84 16.682 3.364 18.891 4.931c2.209 1.567 2.769 4.608 1.262 6.859")
            addPathData("M15.99 20l4.197-4.223c1.08-1.094 1.08-2.854 0-3.948-.515-.524-1.219-.819-1.954-.821-.735-.001-1.439 .292-1.956 .814l-.28 .282-.279-.283c-.515-.524-1.219-.819-1.954-.821-.735-.001-1.439 .292-1.956 .814-1.082 1.092-1.085 2.852-.007 3.948L15.983 20h.007")
        }
        return _hearts!!
    }

private var _hearts: ImageVector? = null
