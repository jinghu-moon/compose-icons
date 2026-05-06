package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarFanAuto: ImageVector
    get() {
        if (_carFanAuto != null) return _carFanAuto!!
        _carFanAuto = tablerOutlineIcon(
            name = "CarFanAuto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v-9l4.912 1.914c.57 .222 .977 .733 1.065 1.338 .089 .605-.155 1.211-.637 1.587L12 12")
            addPathData("M14.044 14.624 12 12h4")
            addPathData("M12 12h-9L4.914 7.088c.222-.57 .733-.977 1.338-1.065 .605-.089 1.211 .155 1.587 .637L12 12")
            addPathData("M12 12v9L7.088 19.086c-.57-.222-.977-.733-1.065-1.338-.089-.605 .155-1.211 .637-1.587L12 12")
            addPathData("M17 21v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4")
            addPathData("M17 19h4")
        }
        return _carFanAuto!!
    }

private var _carFanAuto: ImageVector? = null
