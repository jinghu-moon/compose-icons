package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorFillIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 140.000 L 160.000 72.850 C 159.981 71.178 161.004 69.671 162.565 69.072 C 164.125 68.472 165.894 68.906 167.000 70.160 L 222.000 130.620 C 224.609 133.485 224.790 137.807 222.430 140.880 C 220.840 142.885 218.409 144.038 215.850 144.000 L 164.000 144.000 C 161.791 144.000 160.000 142.209 160.000 140.000 ZM 247.210 172.530 C 245.877 169.760 243.074 167.999 240.000 168.000 L 144.000 168.000 L 144.000 8.000 C 143.982 4.621 141.843 1.618 138.655 0.497 C 135.468 -0.625 131.920 0.377 129.790 3.000 L 25.790 131.000 C 23.872 133.396 23.493 136.679 24.816 139.448 C 26.139 142.218 28.931 143.987 32.000 144.000 L 128.000 144.000 L 128.000 168.000 L 16.000 168.000 C 12.923 167.998 10.118 169.761 8.785 172.534 C 7.452 175.307 7.827 178.598 9.750 181.000 L 39.350 218.000 C 42.380 221.801 46.979 224.010 51.840 224.000 L 204.160 224.000 C 209.021 224.010 213.620 221.801 216.650 218.000 L 246.250 181.000 C 248.173 178.596 248.546 175.303 247.210 172.530 Z"),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
