package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorBoldIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 156.000 L 168.790 156.000 L 164.060 140.000 L 216.000 140.000 C 222.627 140.000 228.000 134.627 228.000 128.000 L 228.000 124.000 C 228.003 96.159 216.843 69.480 197.018 49.933 C 177.193 30.386 150.358 19.604 122.520 20.000 C 66.000 20.800 20.000 67.430 20.000 124.000 C 19.986 158.386 36.969 190.555 65.370 209.940 C 67.368 211.292 69.728 212.009 72.140 212.000 L 116.000 212.000 C 122.066 211.999 127.804 209.245 131.599 204.513 C 135.394 199.780 136.836 193.581 135.520 187.660 Q 135.430 187.250 135.310 186.850 L 133.310 180.000 L 150.890 180.000 L 160.890 213.670 C 163.426 222.122 171.176 227.933 180.000 228.000 L 216.000 228.000 C 227.046 228.000 236.000 219.046 236.000 208.000 L 236.000 176.000 C 236.000 164.954 227.046 156.000 216.000 156.000 ZM 100.400 123.480 C 96.595 128.210 95.152 134.416 96.480 140.340 Q 96.570 140.750 96.690 141.150 L 110.610 188.000 L 76.000 188.000 C 55.856 172.892 44.000 149.181 44.000 124.000 C 44.000 80.520 79.390 44.640 122.860 44.000 L 124.000 44.000 C 165.089 43.994 199.501 75.117 203.610 116.000 L 116.000 116.000 C 109.933 115.990 104.191 118.743 100.400 123.480 ZM 126.140 156.000 L 121.390 140.000 L 139.000 140.000 L 143.730 156.000 ZM 212.000 204.000 L 183.000 204.000 L 175.910 180.000 L 212.000 180.000 Z"),
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
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
