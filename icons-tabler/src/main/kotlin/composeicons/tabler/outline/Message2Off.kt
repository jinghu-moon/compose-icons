package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Message2Off: ImageVector
    get() {
        if (_message2Off != null) return _message2Off!!
        _message2Off = tablerOutlineIcon(
            name = "Message2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h1M13 9h3")
            addPathData("M8 13h5")
            addPathData("M8 4h10c1.657 0 3 1.343 3 3v8c0 .57-.16 1.104-.436 1.558M18 18h-3l-3 3L9 18h-3C4.343 18 3 16.657 3 15v-8C3 5.916 3.575 4.966 4.437 4.439")
            addPathData("M3 3 21 21")
        }
        return _message2Off!!
    }

private var _message2Off: ImageVector? = null
