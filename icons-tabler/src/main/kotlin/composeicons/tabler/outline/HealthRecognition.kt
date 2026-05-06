package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HealthRecognition: ImageVector
    get() {
        if (_healthRecognition != null) return _healthRecognition!!
        _healthRecognition = tablerOutlineIcon(
            name = "HealthRecognition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M8.603 9.61c.384-.391 .908-.611 1.456-.611 .548 0 1.072 .22 1.456 .611L12 10l.5-.396c.383-.387 .906-.603 1.45-.602 .544 .001 1.066 .221 1.447 .609 .804 .819 .804 2.13 0 2.949L12 16 8.603 12.56c-.805-.819-.805-2.131 0-2.95")
        }
        return _healthRecognition!!
    }

private var _healthRecognition: ImageVector? = null
