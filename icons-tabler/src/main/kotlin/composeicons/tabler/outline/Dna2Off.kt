package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dna2Off: ImageVector
    get() {
        if (_dna2Off != null) return _dna2Off!!
        _dna2Off = tablerOutlineIcon(
            name = "Dna2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3v1c-.007 2.46-.91 4.554-2.705 6.281M12 12C8.672 13.99 7 16.662 6.992 20.014v1")
            addPathData("M17 21.014v-1c0-1.44-.315-2.755-.932-3.944M12 12C10.097 10.862 8.737 9.515 7.918 7.932")
            addPathData("M8 4h9")
            addPathData("M7 20h10")
            addPathData("M12 8h4")
            addPathData("M8 16h8")
            addPathData("M3 3 21 21")
        }
        return _dna2Off!!
    }

private var _dna2Off: ImageVector? = null
