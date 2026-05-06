package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Contrast2Off: ImageVector
    get() {
        if (_contrast2Off != null) return _contrast2Off!!
        _contrast2Off = tablerOutlineIcon(
            name = "Contrast2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18h2c3.314 0 6-2.686 6-6M12.878 8.874C13.968 7.089 15.908 6 18 6h2")
            addPathData("M8 4h10c1.105 0 2 .895 2 2v10M19.414 19.414c-.375 .375-.884 .586-1.414 .586h-12C4.895 20 4 19.105 4 18v-12C4 5.453 4.22 4.957 4.576 4.595")
            addPathData("M3 3 21 21")
        }
        return _contrast2Off!!
    }

private var _contrast2Off: ImageVector? = null
