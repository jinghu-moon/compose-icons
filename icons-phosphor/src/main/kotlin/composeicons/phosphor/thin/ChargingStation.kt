package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorThinIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M131.31 125.76c.744 1.1 .894 2.497 .4 3.73l-16 40c-.608 1.516-2.077 2.509-3.71 2.51-.511 .002-1.017-.097-1.49-.29-2.048-.824-3.042-3.151-2.22-5.2L122.09 132h-26.09c-1.328-.001-2.569-.66-3.312-1.76-.743-1.1-.893-2.497-.398-3.73l16-40c.828-2.049 3.161-3.038 5.21-2.21 2.049 .828 3.038 3.161 2.21 5.21L101.91 124h26.09c1.327 .001 2.567 .661 3.31 1.76ZM244 86.63v81.37c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20v-40c0-6.627-5.373-12-12-12h-20v96h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-156C52 44.954 60.954 36 72 36h80c11.046 0 20 8.954 20 20v52h20c11.046 0 20 8.954 20 20v40c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-81.37c.003-3.184-1.26-6.238-3.51-8.49L213.17 58.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0l19.31 19.32c3.765 3.74 5.875 8.833 5.86 14.14ZM164 212v-156c0-6.627-5.373-12-12-12h-80C65.373 44 60 49.373 60 56v156Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
