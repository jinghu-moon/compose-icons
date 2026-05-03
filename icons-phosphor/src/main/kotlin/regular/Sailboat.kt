package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorRegularIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 247.210 172.530 C 245.877 169.760 243.074 167.999 240.000 168.000 L 144.000 168.000 L 144.000 144.000 L 216.000 144.000 C 219.166 144.000 222.034 142.132 223.315 139.237 C 224.596 136.342 224.049 132.963 221.920 130.620 L 144.000 44.910 L 144.000 8.000 C 143.982 4.621 141.843 1.618 138.655 0.497 C 135.468 -0.625 131.920 0.377 129.790 3.000 L 25.790 131.000 C 23.872 133.396 23.493 136.679 24.816 139.448 C 26.139 142.218 28.931 143.987 32.000 144.000 L 128.000 144.000 L 128.000 168.000 L 16.000 168.000 C 12.923 167.998 10.118 169.761 8.785 172.534 C 7.452 175.307 7.827 178.598 9.750 181.000 L 39.350 218.000 C 42.380 221.801 46.979 224.010 51.840 224.000 L 204.160 224.000 C 209.021 224.010 213.620 221.801 216.650 218.000 L 246.250 181.000 C 248.173 178.596 248.546 175.303 247.210 172.530 ZM 197.920 128.000 L 144.000 128.000 L 144.000 68.690 ZM 48.810 128.000 L 128.000 30.530 L 128.000 128.000 ZM 204.160 208.000 L 51.840 208.000 L 32.640 184.000 L 223.360 184.000 Z"),
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
