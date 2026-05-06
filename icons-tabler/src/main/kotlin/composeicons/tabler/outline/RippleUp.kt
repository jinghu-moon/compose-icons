package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RippleUp: ImageVector
    get() {
        if (_rippleUp != null) return _rippleUp!!
        _rippleUp = tablerOutlineIcon(
            name = "RippleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7Q7.5 4 12 7q4.5 3 9 0")
            addPathData("M3 17q4.5-3 9 0 .218 .144 .434 .275")
            addPathData("M3 12q4.5-3 9 0 1.941 1.294 3.882 1.472")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _rippleUp!!
    }

private var _rippleUp: ImageVector? = null
