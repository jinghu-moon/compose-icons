package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PumpkinScary: ImageVector
    get() {
        if (_pumpkinScary != null) return _pumpkinScary!!
        _pumpkinScary = tablerOutlineIcon(
            name = "PumpkinScary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15l1.5 1L12 15l1.5 1L15 15")
            addPathData("M10 11h.01")
            addPathData("M14 11h.01")
            addPathData("M17 6.082c2.609 .588 3.627 4.162 2.723 7.983-.903 3.82-2.75 6.44-5.359 5.853-.268-.061-.528-.155-.774-.279-.497 .236-1.04 .359-1.59 .361-.556 0-1.09-.127-1.59-.362-.245 .125-.505 .219-.774 .28C7.027 20.506 5.18 17.885 4.276 14.065 3.373 10.245 4.391 6.67 7 6.082c1.085-.244 1.575 .066 2.585 .787C10.301 6.315 11.125 6 12 6c.876 0 1.699 .315 2.415 .87C15.425 6.148 15.915 5.838 17 6.082")
            addPathData("M12 6c0-1.226 .693-2.346 1.789-2.894L14 3")
        }
        return _pumpkinScary!!
    }

private var _pumpkinScary: ImageVector? = null
