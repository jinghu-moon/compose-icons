package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorBoldIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 120.000 C 235.934 60.381 187.619 12.066 128.000 12.000 L 128.000 12.000 C 68.381 12.066 20.066 60.381 20.000 120.000 C 20.005 123.338 21.400 126.523 23.850 128.790 L 24.070 128.990 C 24.240 129.140 24.420 129.300 24.610 129.440 L 24.800 129.600 L 116.000 198.000 L 116.000 212.000 L 112.000 212.000 C 105.373 212.000 100.000 217.373 100.000 224.000 C 100.000 230.627 105.373 236.000 112.000 236.000 L 144.000 236.000 C 150.627 236.000 156.000 230.627 156.000 224.000 C 156.000 217.373 150.627 212.000 144.000 212.000 L 140.000 212.000 L 140.000 198.000 L 231.200 129.600 L 231.200 129.600 C 234.222 127.334 236.000 123.777 236.000 120.000 ZM 211.150 108.000 L 179.630 108.000 C 177.840 78.730 169.630 57.470 160.700 42.640 C 187.769 54.132 206.889 78.903 211.150 108.000 ZM 100.420 108.000 C 103.150 68.760 119.000 48.110 128.000 39.380 C 137.000 48.110 152.850 68.760 155.580 108.000 ZM 95.300 42.640 C 86.300 57.470 78.160 78.730 76.370 108.000 L 44.850 108.000 C 49.111 78.903 68.231 54.132 95.300 42.640 ZM 68.000 132.000 L 116.000 132.000 L 116.000 168.000 ZM 140.000 132.000 L 188.000 132.000 L 140.000 168.000 Z"),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
