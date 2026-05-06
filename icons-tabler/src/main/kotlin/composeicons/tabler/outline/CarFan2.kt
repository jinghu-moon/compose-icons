package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarFan2: ImageVector
    get() {
        if (_carFan2 != null) return _carFan2!!
        _carFan2 = tablerOutlineIcon(
            name = "CarFan2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v-9l4.912 1.914c.57 .222 .977 .733 1.065 1.338 .089 .605-.155 1.211-.637 1.587L12 12")
            addPathData("M14.044 14.624 12 12h4")
            addPathData("M12 12h-9L4.914 7.088c.222-.57 .733-.977 1.338-1.065 .605-.089 1.211 .155 1.587 .637L12 12")
            addPathData("M12 12v9L7.088 19.086c-.57-.222-.977-.733-1.065-1.338-.089-.605 .155-1.211 .637-1.587L12 12")
            addPathData("M18 15h2c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-1c-.552 0-1 .448-1 1v1c0 .552 .448 1 1 1h2")
        }
        return _carFan2!!
    }

private var _carFan2: ImageVector? = null
