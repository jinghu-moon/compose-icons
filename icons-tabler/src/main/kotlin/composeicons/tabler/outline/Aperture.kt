package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = tablerOutlineIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M3.6 15h10.55")
            addPathData("M6.551 4.938 9.811 14.972")
            addPathData("M17.032 4.636 8.497 10.837")
            addPathData("M20.559 14.51 12.024 8.309")
            addPathData("M12.257 20.916 15.518 10.882")
        }
        return _aperture!!
    }

private var _aperture: ImageVector? = null
