package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = phosphorBoldIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.570 193.730 L 202.380 35.930 C 201.295 30.719 198.177 26.156 193.718 23.251 C 189.258 20.346 183.825 19.338 178.620 20.450 L 131.810 30.510 C 127.506 31.443 123.636 33.783 120.810 37.160 C 117.127 31.449 110.796 27.999 104.000 28.000 L 56.000 28.000 C 44.954 28.000 36.000 36.954 36.000 48.000 L 36.000 208.000 C 36.000 219.046 44.954 228.000 56.000 228.000 L 104.000 228.000 C 115.046 228.000 124.000 219.046 124.000 208.000 L 124.000 90.250 L 149.620 212.070 C 151.545 221.330 159.692 227.976 169.150 228.000 C 170.572 227.999 171.990 227.848 173.380 227.550 L 220.190 217.490 C 230.969 215.134 237.834 204.529 235.570 193.730 ZM 148.190 88.650 L 187.190 80.270 L 189.720 92.270 L 150.720 100.650 ZM 155.650 124.150 L 194.650 115.770 L 203.810 159.350 L 164.810 167.730 ZM 179.710 44.760 L 182.240 56.760 L 143.240 65.140 L 140.710 53.140 ZM 60.000 88.000 L 100.000 88.000 L 100.000 168.000 L 60.000 168.000 ZM 100.000 52.000 L 100.000 64.000 L 60.000 64.000 L 60.000 52.000 ZM 60.000 204.000 L 60.000 192.000 L 100.000 192.000 L 100.000 204.000 ZM 172.290 203.240 L 169.760 191.240 L 208.760 182.860 L 211.290 194.860 Z"),
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
        return _books!!
    }

private var _books: ImageVector? = null
