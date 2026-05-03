package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorFillIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 80.000 L 159.370 80.000 L 90.830 158.330 C 79.124 143.971 76.726 124.159 84.668 107.422 C 92.610 90.685 109.475 80.013 128.000 80.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 189.270 58.000 C 187.673 56.602 185.587 55.896 183.470 56.036 C 181.352 56.177 179.378 57.153 177.980 58.750 L 173.370 64.000 L 128.000 64.000 C 102.813 64.020 79.980 78.810 69.665 101.787 C 59.349 124.764 63.469 151.655 80.190 170.490 L 66.000 186.730 C 63.401 190.071 63.855 194.859 67.035 197.653 C 70.216 200.446 75.022 200.278 78.000 197.270 L 92.220 181.000 C 102.774 188.172 115.240 192.004 128.000 192.000 L 176.000 192.000 C 180.418 192.000 184.000 188.418 184.000 184.000 C 184.000 179.582 180.418 176.000 176.000 176.000 L 128.000 176.000 C 119.123 176.012 110.419 173.542 102.870 168.870 L 190.000 69.270 C 192.903 65.954 192.576 60.914 189.270 58.000 Z"),
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
        return _notSubsetOf!!
    }

private var _notSubsetOf: ImageVector? = null
