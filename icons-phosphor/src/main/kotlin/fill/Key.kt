package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorFillIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.570 39.430 C 190.412 13.236 149.699 8.409 118.141 27.761 C 86.584 47.113 72.425 85.588 83.910 120.780 L 28.690 176.000 C 25.676 178.990 23.986 183.064 24.000 187.310 L 24.000 216.000 C 24.000 224.837 31.163 232.000 40.000 232.000 L 72.000 232.000 C 76.418 232.000 80.000 228.418 80.000 224.000 L 80.000 208.000 L 96.000 208.000 C 100.418 208.000 104.000 204.418 104.000 200.000 L 104.000 184.000 L 120.000 184.000 C 122.122 184.002 124.158 183.160 125.660 181.660 L 135.220 172.090 C 143.222 174.693 151.585 176.012 160.000 176.000 L 160.100 176.000 C 192.440 175.961 221.575 156.455 233.932 126.569 C 246.290 96.683 239.438 62.297 216.570 39.430 ZM 180.000 92.000 C 171.163 92.000 164.000 84.837 164.000 76.000 C 164.000 67.163 171.163 60.000 180.000 60.000 C 188.837 60.000 196.000 67.163 196.000 76.000 C 196.000 84.837 188.837 92.000 180.000 92.000 Z"),
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
        return _key!!
    }

private var _key: ImageVector? = null
