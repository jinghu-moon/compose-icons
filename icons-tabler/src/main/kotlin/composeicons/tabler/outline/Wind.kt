package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = tablerOutlineIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 8h8.5c1.29 .025 2.386-.936 2.532-2.218C16.177 4.501 15.324 3.319 14.061 3.054c-1.262-.265-2.519 .474-2.901 1.706")
            addPathData("M3 12h15.5c1.29-.025 2.386 .936 2.532 2.218 .145 1.282-.708 2.464-1.971 2.729-1.262 .265-2.519-.474-2.901-1.706")
            addPathData("M4 16h5.5c1.29-.025 2.386 .936 2.532 2.218 .145 1.282-.708 2.464-1.971 2.729C8.799 21.211 7.542 20.472 7.16 19.24")
        }
        return _wind!!
    }

private var _wind: ImageVector? = null
