package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Certificate2Off: ImageVector
    get() {
        if (_certificate2Off != null) return _certificate2Off!!
        _certificate2Off = tablerOutlineIcon(
            name = "Certificate2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12c-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3")
            addPathData("M11 7h3")
            addPathData("M10 18v4l2-1 2 1v-4")
            addPathData("M10 19h-2C6.895 19 6 18.105 6 17v-11M7.18 3.175C7.43 3.063 7.709 3 8 3h8c1.105 0 2 .895 2 2v9M17.825 17.82C17.502 18.538 16.788 19 16 19h-2")
            addPathData("M3 3 21 21")
        }
        return _certificate2Off!!
    }

private var _certificate2Off: ImageVector? = null
