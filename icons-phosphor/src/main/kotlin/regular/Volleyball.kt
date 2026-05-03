package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorRegularIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 209.740 160.580 C 181.884 179.675 145.557 181.144 116.250 164.360 L 132.620 136.000 L 215.620 136.000 C 214.865 144.436 212.884 152.716 209.740 160.580 ZM 91.120 48.110 C 98.803 44.552 106.961 42.127 115.340 40.910 C 145.803 55.494 165.231 86.226 165.340 120.000 L 132.620 120.000 ZM 215.630 120.000 L 181.370 120.000 C 181.269 89.987 168.229 61.475 145.590 41.770 C 183.610 49.589 212.046 81.350 215.630 120.000 ZM 77.270 56.130 L 94.390 85.780 C 68.447 100.868 50.274 126.414 44.530 155.870 C 32.230 119.041 45.536 78.505 77.270 56.130 ZM 58.900 182.430 C 56.320 148.777 73.216 116.613 102.390 99.640 L 118.760 128.000 L 77.270 199.870 C 70.343 194.966 64.157 189.093 58.900 182.430 ZM 128.000 216.000 C 115.263 216.013 102.677 213.245 91.120 207.890 L 108.250 178.220 C 134.259 193.114 165.421 196.091 193.780 186.390 C 177.107 205.227 153.156 216.008 128.000 216.000 Z"),
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
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
