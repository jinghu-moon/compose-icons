package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wifi2: ImageVector
    get() {
        if (_wifi2 != null) return _wifi2!!
        _wifi2 = tablerOutlineIcon(
            name = "Wifi2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18h.01")
            addPathData("M9.172 15.172c1.562-1.562 4.094-1.562 5.656 0")
            addPathData("M6.343 12.343C7.843 10.843 9.878 10 12 10c2.122 0 4.157 .843 5.657 2.343")
        }
        return _wifi2!!
    }

private var _wifi2: ImageVector? = null
