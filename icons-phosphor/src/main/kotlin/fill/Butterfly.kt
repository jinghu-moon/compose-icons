package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorFillIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 100.170 C 125.628 95.778 122.954 91.554 120.000 87.530 L 120.000 56.000 C 120.000 51.582 123.582 48.000 128.000 48.000 C 132.418 48.000 136.000 51.582 136.000 56.000 L 136.000 87.530 C 133.046 91.554 130.372 95.778 128.000 100.170 ZM 232.700 50.480 C 229.000 45.700 221.840 40.000 209.000 40.000 C 192.150 40.000 170.540 51.280 151.190 70.160 C 145.658 75.522 140.577 81.332 136.000 87.530 L 136.000 180.000 C 136.000 184.418 132.418 188.000 128.000 188.000 C 123.582 188.000 120.000 184.418 120.000 180.000 L 120.000 87.530 C 115.436 81.334 110.369 75.524 104.850 70.160 C 85.490 51.280 63.880 40.000 47.000 40.000 C 34.160 40.000 27.000 45.700 23.300 50.480 C 16.480 59.250 11.120 74.560 23.090 121.680 C 29.140 145.510 42.600 154.680 53.720 158.100 C 41.101 178.590 47.284 205.416 67.598 218.316 C 87.912 231.216 114.821 225.404 128.000 205.270 C 141.179 225.404 168.088 231.216 188.402 218.316 C 208.716 205.416 214.899 178.590 202.280 158.100 C 213.400 154.700 226.850 145.510 232.910 121.680 C 239.630 95.240 244.850 66.100 232.700 50.480 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
