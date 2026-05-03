package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorFillIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 215.630 120.000 L 181.370 120.000 C 181.269 89.987 168.229 61.475 145.590 41.770 C 183.610 49.589 212.046 81.350 215.630 120.000 ZM 44.530 155.870 C 32.230 119.041 45.536 78.505 77.270 56.130 L 94.390 85.780 C 68.447 100.868 50.274 126.414 44.530 155.870 ZM 58.900 182.430 C 56.320 148.777 73.216 116.613 102.390 99.640 L 118.760 128.000 L 77.270 199.870 C 70.343 194.966 64.157 189.093 58.900 182.430 ZM 209.740 160.580 C 181.884 179.675 145.557 181.144 116.250 164.360 L 132.620 136.000 L 215.620 136.000 C 214.865 144.436 212.884 152.716 209.740 160.580 Z"),
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
