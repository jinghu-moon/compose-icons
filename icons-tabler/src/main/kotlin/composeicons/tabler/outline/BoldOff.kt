package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoldOff: ImageVector
    get() {
        if (_boldOff != null) return _boldOff!!
        _boldOff = tablerOutlineIcon(
            name = "BoldOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h4c1.478 0 2.796 .929 3.295 2.32 .498 1.391 .069 2.946-1.073 3.884M12 12h-5v-5")
            addPathData("M17.107 17.112C16.505 18.272 15.307 19 14 19h-7v-7")
            addPathData("M3 3 21 21")
        }
        return _boldOff!!
    }

private var _boldOff: ImageVector? = null
