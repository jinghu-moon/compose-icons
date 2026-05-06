package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldOff: ImageVector
    get() {
        if (_worldOff != null) return _worldOff!!
        _worldOff = tablerOutlineIcon(
            name = "WorldOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.657 5.615C2.139 9.127 2.134 14.825 5.646 18.343c3.512 3.518 9.21 3.523 12.728 .011M20.046 16.032C21.781 12.568 21.105 8.383 18.368 5.641 15.631 2.9 11.446 2.218 7.98 3.948")
            addPathData("M3.6 9h5.4M13 9h7.4")
            addPathData("M3.6 15h11.4M19 15h1.4")
            addPathData("M11.5 3c-.597 .955-1.097 1.968-1.493 3.022M9.16 9.167c-.68 4.027 .1 8.244 2.34 11.833")
            addPathData("M12.5 3c1.507 2.413 2.383 5.165 2.549 8.005M14.842 14.823c-.369 2.192-1.164 4.291-2.342 6.177")
            addPathData("M3 3 21 21")
        }
        return _worldOff!!
    }

private var _worldOff: ImageVector? = null
