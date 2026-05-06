package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Network: ImageVector
    get() {
        if (_network != null) return _network!!
        _network = tablerOutlineIcon(
            name = "Network",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 9c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C18 5.686 15.314 3 12 3 8.686 3 6 5.686 6 9")
            addPathData("M12 3c1.333 .333 2 2.333 2 6 0 3.667-.667 5.667-2 6")
            addPathData("M12 3c-1.333 .333-2 2.333-2 6 0 3.667 .667 5.667 2 6")
            addPathData("M6 9h12")
            addPathData("M3 20h7")
            addPathData("M14 20h7")
            addPathData("M10 20c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M12 15v3")
        }
        return _network!!
    }

private var _network: ImageVector? = null
