package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorFillIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.090 98.900 C 168.894 106.275 169.276 115.688 165.085 123.428 C 160.894 131.168 152.802 135.993 144.000 136.000 L 131.630 136.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 189.270 58.000 C 187.673 56.602 185.587 55.896 183.470 56.036 C 181.352 56.177 179.378 57.153 177.980 58.750 L 162.420 76.510 C 156.733 73.545 150.414 71.998 144.000 72.000 L 80.000 72.000 C 75.582 72.000 72.000 75.582 72.000 80.000 C 72.000 84.418 75.582 88.000 80.000 88.000 L 144.000 88.000 C 146.499 87.999 148.983 88.390 151.360 89.160 L 110.360 136.000 L 80.000 136.000 C 75.582 136.000 72.000 139.582 72.000 144.000 C 72.000 148.418 75.582 152.000 80.000 152.000 L 96.370 152.000 L 66.000 186.730 C 63.401 190.071 63.855 194.859 67.035 197.653 C 70.216 200.446 75.022 200.278 78.000 197.270 L 89.630 184.000 L 176.000 184.000 C 180.418 184.000 184.000 180.418 184.000 176.000 C 184.000 171.582 180.418 168.000 176.000 168.000 L 103.630 168.000 L 117.630 152.000 L 144.000 152.000 C 159.470 151.991 173.549 143.063 180.152 129.072 C 186.754 115.082 184.698 98.538 174.870 86.590 L 190.000 69.270 C 192.903 65.954 192.576 60.914 189.270 58.000 Z"),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
