package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarSuv: ImageVector
    get() {
        if (_carSuv != null) return _carSuv!!
        _carSuv = tablerOutlineIcon(
            name = "CarSuv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 15.895 8.105 15 7 15c-1.105 0-2 .895-2 2")
            addPathData("M16 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M5 9 7 5h7.438c.918 0 1.717 .625 1.94 1.515L17 9h3c1.105 0 2 .895 2 2v3")
            addPathData("M10 9v-4")
            addPathData("M2 7v4")
            addPathData("M22.001 14.001C21.058 12.74 19.575 11.999 18 12c-1.574-.001-3.057 .74-4 2h-3C10.056 12.739 8.573 11.998 6.998 11.998c-1.575 .001-3.058 .744-4.001 2.005")
            addPathData("M5 12v-3h13")
        }
        return _carSuv!!
    }

private var _carSuv: ImageVector? = null
