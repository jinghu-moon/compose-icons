package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorFillIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 183.050 56.000 L 72.000 56.000 C 52.314 56.000 33.487 64.060 19.900 78.305 C 6.313 92.550 -0.850 111.736 0.080 131.400 C 1.770 168.090 31.840 198.190 68.530 199.920 C 84.370 200.640 100.530 194.020 117.910 179.620 C 123.781 174.760 132.279 174.760 138.150 179.620 C 148.720 188.390 165.000 200.000 184.000 200.000 C 203.261 200.002 221.720 192.286 235.251 178.577 C 248.781 164.868 256.254 146.310 256.000 127.050 C 255.490 87.870 222.760 56.000 183.050 56.000 ZM 176.000 104.000 L 80.000 104.000 C 75.582 104.000 72.000 100.418 72.000 96.000 C 72.000 91.582 75.582 88.000 80.000 88.000 L 176.000 88.000 C 180.418 88.000 184.000 91.582 184.000 96.000 C 184.000 100.418 180.418 104.000 176.000 104.000 Z"),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
