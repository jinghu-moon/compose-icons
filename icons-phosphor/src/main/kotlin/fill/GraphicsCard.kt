package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorFillIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 48.000 L 16.000 48.000 C 11.582 48.000 8.000 51.582 8.000 56.000 L 8.000 208.000 C 8.000 212.418 11.582 216.000 16.000 216.000 C 20.418 216.000 24.000 212.418 24.000 208.000 L 24.000 192.000 L 40.000 192.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 C 52.418 216.000 56.000 212.418 56.000 208.000 L 56.000 192.000 L 72.000 192.000 L 72.000 208.000 C 72.000 212.418 75.582 216.000 80.000 216.000 C 84.418 216.000 88.000 212.418 88.000 208.000 L 88.000 192.000 L 104.000 192.000 L 104.000 208.000 C 104.000 212.418 107.582 216.000 112.000 216.000 C 116.418 216.000 120.000 212.418 120.000 208.000 L 120.000 192.000 L 232.000 192.000 C 240.837 192.000 248.000 184.837 248.000 176.000 L 248.000 64.000 C 248.000 55.163 240.837 48.000 232.000 48.000 ZM 212.000 120.000 C 212.008 126.781 210.090 133.426 206.470 139.160 L 156.840 89.530 C 167.933 82.557 181.938 82.161 193.407 88.496 C 204.876 94.831 211.997 106.898 212.000 120.000 ZM 116.000 120.000 C 116.008 126.781 114.090 133.426 110.470 139.160 L 60.840 89.530 C 71.933 82.557 85.938 82.161 97.407 88.496 C 108.876 94.831 115.997 106.898 116.000 120.000 ZM 80.000 156.000 C 66.898 155.997 54.831 148.876 48.496 137.407 C 42.161 125.938 42.557 111.933 49.530 100.840 L 99.160 150.470 C 93.426 154.090 86.781 156.008 80.000 156.000 ZM 140.000 120.000 C 139.992 113.219 141.910 106.574 145.530 100.840 L 195.160 150.470 C 184.067 157.443 170.062 157.839 158.593 151.504 C 147.124 145.169 140.003 133.102 140.000 120.000 Z"),
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
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
