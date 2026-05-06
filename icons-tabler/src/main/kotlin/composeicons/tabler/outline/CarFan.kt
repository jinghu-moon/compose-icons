package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarFan: ImageVector
    get() {
        if (_carFan != null) return _carFan!!
        _carFan = tablerOutlineIcon(
            name = "CarFan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v-9l4.912 1.914c.57 .222 .977 .733 1.065 1.338 .089 .605-.155 1.211-.637 1.587L12 12")
            addPathData("M12 12h9l-1.914 4.912c-.222 .57-.733 .977-1.338 1.065-.605 .089-1.211-.155-1.587-.637L12 12")
            addPathData("M12 12h-9L4.914 7.088c.222-.57 .733-.977 1.338-1.065 .605-.089 1.211 .155 1.587 .637L12 12")
            addPathData("M12 12v9L7.088 19.086c-.57-.222-.977-.733-1.065-1.338-.089-.605 .155-1.211 .637-1.587L12 12")
        }
        return _carFan!!
    }

private var _carFan: ImageVector? = null
