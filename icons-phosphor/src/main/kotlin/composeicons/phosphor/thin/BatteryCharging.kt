package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorThinIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 60h-168C20.954 60 12 68.954 12 80v96c0 11.046 8.954 20 20 20h168c11.046 0 20-8.954 20-20v-96C220 68.954 211.046 60 200 60ZM212 176c0 6.627-5.373 12-12 12h-168c-6.627 0-12-5.373-12-12v-96C20 73.373 25.373 68 32 68h168c6.627 0 12 5.373 12 12ZM252 96v64c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM135.4 125.9c.73 1.178 .798 2.65 .18 3.89l-16 32c-.678 1.355-2.064 2.211-3.58 2.21-.621-.003-1.233-.147-1.79-.42-.95-.474-1.672-1.307-2.008-2.314-.336-1.007-.257-2.107 .218-3.056L125.53 132h-25.53c-1.387 .001-2.676-.717-3.405-1.896-.729-1.18-.796-2.653-.175-3.894l16-32c.989-1.977 3.393-2.779 5.37-1.79 1.977 .989 2.779 3.393 1.79 5.37L106.47 124h25.53c1.386 .002 2.672 .72 3.4 1.9Z"),
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
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
