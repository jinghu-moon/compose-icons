package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorRegularIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 88.800 L 216.000 72.000 C 216.000 49.909 198.091 32.000 176.000 32.000 L 80.000 32.000 C 57.909 32.000 40.000 49.909 40.000 72.000 L 40.000 88.800 C 21.357 92.586 7.960 108.977 7.960 128.000 C 7.960 147.023 21.357 163.414 40.000 167.200 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 167.200 C 234.643 163.414 248.040 147.023 248.040 128.000 C 248.040 108.977 234.643 92.586 216.000 88.800 ZM 80.000 48.000 L 176.000 48.000 C 189.255 48.000 200.000 58.745 200.000 72.000 L 200.000 88.800 C 181.388 92.627 168.023 108.999 168.000 128.000 L 88.000 128.000 C 87.977 108.999 74.612 92.627 56.000 88.800 L 56.000 72.000 C 56.000 58.745 66.745 48.000 80.000 48.000 ZM 208.390 152.000 L 208.000 152.000 C 203.582 152.000 200.000 155.582 200.000 160.000 L 200.000 200.000 L 56.000 200.000 L 56.000 160.000 C 56.000 155.582 52.418 152.000 48.000 152.000 L 47.610 152.000 C 34.408 151.785 23.859 140.947 24.001 127.744 C 24.144 114.541 34.924 103.933 48.128 104.004 C 61.331 104.074 71.998 114.796 72.000 128.000 L 72.000 168.000 C 72.000 172.418 75.582 176.000 80.000 176.000 C 84.418 176.000 88.000 172.418 88.000 168.000 L 88.000 144.000 L 168.000 144.000 L 168.000 168.000 C 168.000 172.418 171.582 176.000 176.000 176.000 C 180.418 176.000 184.000 172.418 184.000 168.000 L 184.000 128.000 C 184.002 114.796 194.669 104.074 207.872 104.004 C 221.076 103.933 231.856 114.541 231.999 127.744 C 232.141 140.947 221.592 151.785 208.390 152.000 Z"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
