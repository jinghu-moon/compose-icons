package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Diaper: ImageVector
    get() {
        if (_diaper != null) return _diaper!!
        _diaper = tablerOutlineIcon(
            name = "Diaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8.323C3 7.744 3 7.455 3.044 7.213 3.246 6.109 4.11 5.246 5.214 5.044 5.453 5 5.743 5 6.323 5h11.353c.579 0 .868 0 1.11 .044 1.104 .202 1.967 1.066 2.169 2.17 .044 .24 .044 .53 .044 1.11v2.676c0 4.971-4.029 9-9 9C7.028 20 2.999 15.971 2.999 11L3 8.323")
            addPathData("M17 9h4")
            addPathData("M3 9h4")
            addPathData("M14.25 19.7v-1.4C14.25 14.821 17.071 12 20.55 12")
            addPathData("M9.75 19.7v-1.4C9.75 14.821 6.929 12 3.45 12")
        }
        return _diaper!!
    }

private var _diaper: ImageVector? = null
