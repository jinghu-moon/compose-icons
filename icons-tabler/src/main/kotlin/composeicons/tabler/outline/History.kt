package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.History: ImageVector
    get() {
        if (_history != null) return _history!!
        _history = tablerOutlineIcon(
            name = "History",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8v4l2 2")
            addPathData("M3.05 11C3.514 6.445 7.323 2.965 11.901 2.913c4.578-.052 8.465 3.34 9.033 7.883 .568 4.543-2.365 8.788-6.815 9.864C9.669 21.736 5.121 19.3 3.55 15M3.05 20v-5h5")
        }
        return _history!!
    }

private var _history: ImageVector? = null
