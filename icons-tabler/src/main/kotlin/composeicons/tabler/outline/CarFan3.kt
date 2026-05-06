package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarFan3: ImageVector
    get() {
        if (_carFan3 != null) return _carFan3!!
        _carFan3 = tablerOutlineIcon(
            name = "CarFan3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v-9l4.912 1.914c.57 .222 .977 .733 1.065 1.338 .089 .605-.155 1.211-.637 1.587L12 12")
            addPathData("M14.044 14.624 12 12h4")
            addPathData("M12 12h-9L4.914 7.088c.222-.57 .733-.977 1.338-1.065 .605-.089 1.211 .155 1.587 .637L12 12")
            addPathData("M12 12v9L7.088 19.086c-.57-.222-.977-.733-1.065-1.338-.089-.605 .155-1.211 .637-1.587L12 12")
            addPathData("M18 15.5c0-.276 .224-.5 .5-.5h1c.828 0 1.5 .672 1.5 1.5C21 17.328 20.328 18 19.5 18h-.5 .5c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-1C18.224 21 18 20.776 18 20.5")
        }
        return _carFan3!!
    }

private var _carFan3: ImageVector? = null
