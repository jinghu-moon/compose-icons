package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorBoldIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 20.000 L 96.000 20.000 C 84.954 20.000 76.000 28.954 76.000 40.000 L 76.000 60.000 L 64.000 60.000 C 52.954 60.000 44.000 68.954 44.000 80.000 L 44.000 224.000 C 44.000 228.573 46.598 232.748 50.700 234.768 C 54.803 236.787 59.697 236.299 63.320 233.510 L 108.000 199.140 L 152.690 233.510 C 156.313 236.293 161.203 236.777 165.302 234.759 C 169.401 232.740 171.998 228.569 172.000 224.000 L 172.000 177.600 L 192.680 193.510 C 196.303 196.299 201.197 196.787 205.300 194.768 C 209.402 192.748 212.000 188.573 212.000 184.000 L 212.000 40.000 C 212.000 28.954 203.046 20.000 192.000 20.000 ZM 148.000 199.630 L 115.310 174.490 C 110.997 171.174 104.993 171.174 100.680 174.490 L 68.000 199.630 L 68.000 84.000 L 148.000 84.000 ZM 188.000 159.630 L 172.000 147.330 L 172.000 80.000 C 172.000 68.954 163.046 60.000 152.000 60.000 L 100.000 60.000 L 100.000 44.000 L 188.000 44.000 Z"),
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
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
