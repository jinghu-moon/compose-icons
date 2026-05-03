package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorThinIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.740 57.290 C 180.018 38.472 154.545 27.925 128.000 28.000 L 127.810 28.000 C 80.123 28.104 39.145 61.865 29.918 108.651 C 20.691 155.437 45.784 202.228 89.860 220.429 C 133.937 238.630 184.733 223.176 211.205 183.512 C 237.677 143.848 232.459 91.010 198.740 57.290 ZM 62.920 63.000 C 79.098 46.736 100.802 37.151 123.720 36.150 C 122.711 59.049 113.126 80.731 96.870 96.890 C 80.695 113.139 59.005 122.718 36.100 123.730 C 37.133 100.845 46.701 79.178 62.920 63.000 ZM 36.090 131.740 C 61.126 130.732 84.857 120.303 102.530 102.540 C 120.308 84.873 130.743 61.134 131.740 36.090 C 179.623 37.997 218.003 76.377 219.910 124.260 C 168.028 126.472 126.472 168.028 124.260 219.910 C 76.377 218.003 37.997 179.623 36.090 131.740 ZM 193.090 193.050 C 176.912 209.314 155.208 218.899 132.290 219.900 C 134.495 172.450 172.461 134.480 219.910 132.270 C 218.887 155.173 209.314 176.861 193.080 193.050 Z"),
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
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
