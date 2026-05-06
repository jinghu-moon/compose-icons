package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MedicalCrossCircle: ImageVector
    get() {
        if (_medicalCrossCircle != null) return _medicalCrossCircle!!
        _medicalCrossCircle = tablerOutlineIcon(
            name = "MedicalCrossCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 8v8")
            addPathData("M15.5 10l-7 4")
            addPathData("M15.5 14l-7-4")
        }
        return _medicalCrossCircle!!
    }

private var _medicalCrossCircle: ImageVector? = null
