package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShareOff: ImageVector
    get() {
        if (_shareOff != null) return _shareOff!!
        _shareOff = tablerOutlineIcon(
            name = "ShareOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 10.343 7.657 9 6 9 4.343 9 3 10.343 3 12")
            addPathData("M15 6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C21 4.343 19.657 3 18 3 16.343 3 15 4.343 15 6")
            addPathData("M15.861 15.896c-1.153 1.18-1.137 3.069 .035 4.229 1.173 1.16 3.062 1.156 4.229-.009M20.704 16.699c-.313-.648-.848-1.162-1.507-1.45")
            addPathData("M8.7 10.7l1.336-.688M12.66 8.66 15.3 7.3")
            addPathData("M8.7 13.3l6.6 3.4")
            addPathData("M3 3 21 21")
        }
        return _shareOff!!
    }

private var _shareOff: ImageVector? = null
