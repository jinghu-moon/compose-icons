package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = phosphorBoldIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 80.000 C 252.018 66.613 243.701 54.631 231.153 49.965 C 218.606 45.299 204.481 48.936 195.748 59.082 C 187.014 69.227 185.519 83.737 192.000 95.450 L 171.140 121.110 L 150.820 74.400 C 163.160 61.848 163.045 41.686 150.563 29.275 C 138.081 16.864 117.919 16.864 105.437 29.275 C 92.955 41.686 92.840 61.848 105.180 74.400 L 84.870 121.110 L 64.000 95.450 C 70.651 83.387 68.836 68.422 59.494 58.299 C 50.153 48.176 35.382 45.166 22.824 50.828 C 10.267 56.489 2.742 69.551 4.143 83.255 C 5.544 96.958 15.557 108.227 29.000 111.230 L 43.000 195.290 C 44.588 204.966 52.975 212.051 62.780 212.000 L 193.220 212.000 C 203.025 212.051 211.412 204.966 213.000 195.290 L 227.000 111.230 C 241.605 107.937 251.984 94.971 252.000 80.000 ZM 220.000 72.000 C 224.418 72.000 228.000 75.582 228.000 80.000 C 228.000 84.418 224.418 88.000 220.000 88.000 C 215.582 88.000 212.000 84.418 212.000 80.000 C 212.000 75.582 215.582 72.000 220.000 72.000 ZM 128.000 44.000 C 132.418 44.000 136.000 47.582 136.000 52.000 C 136.000 56.418 132.418 60.000 128.000 60.000 C 123.582 60.000 120.000 56.418 120.000 52.000 C 120.000 47.582 123.582 44.000 128.000 44.000 ZM 36.000 72.000 C 40.418 72.000 44.000 75.582 44.000 80.000 C 44.000 84.418 40.418 88.000 36.000 88.000 C 31.582 88.000 28.000 84.418 28.000 80.000 C 28.000 75.582 31.582 72.000 36.000 72.000 ZM 189.830 188.000 L 66.170 188.000 L 55.290 122.780 L 78.690 151.570 C 80.968 154.373 84.388 156.000 88.000 156.000 C 88.545 155.998 89.090 155.961 89.630 155.890 C 93.778 155.320 97.329 152.629 99.000 148.790 L 127.180 84.000 L 128.000 84.000 L 128.820 84.000 L 157.000 148.790 C 158.671 152.629 162.222 155.320 166.370 155.890 C 166.910 155.961 167.455 155.998 168.000 156.000 C 171.612 156.000 175.032 154.373 177.310 151.570 L 200.710 122.780 Z"),
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
        return _crown!!
    }

private var _crown: ImageVector? = null
