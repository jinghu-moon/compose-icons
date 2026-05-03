package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorFillIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 48.000 L 112.000 208.000 C 112.000 212.418 108.418 216.000 104.000 216.000 C 99.582 216.000 96.000 212.418 96.000 208.000 L 96.000 136.000 L 64.000 136.000 L 64.000 160.000 C 64.003 163.238 62.053 166.158 59.062 167.397 C 56.071 168.636 52.628 167.951 50.340 165.660 L 18.340 133.660 C 16.838 132.159 15.994 130.123 15.994 128.000 C 15.994 125.877 16.838 123.841 18.340 122.340 L 50.340 90.340 C 52.628 88.049 56.071 87.364 59.062 88.603 C 62.053 89.842 64.003 92.762 64.000 96.000 L 64.000 120.000 L 96.000 120.000 L 96.000 48.000 C 96.000 43.582 99.582 40.000 104.000 40.000 C 108.418 40.000 112.000 43.582 112.000 48.000 ZM 237.660 122.340 L 205.660 90.340 C 203.372 88.049 199.929 87.364 196.938 88.603 C 193.947 89.842 191.997 92.762 192.000 96.000 L 192.000 120.000 L 160.000 120.000 L 160.000 48.000 C 160.000 43.582 156.418 40.000 152.000 40.000 C 147.582 40.000 144.000 43.582 144.000 48.000 L 144.000 208.000 C 144.000 212.418 147.582 216.000 152.000 216.000 C 156.418 216.000 160.000 212.418 160.000 208.000 L 160.000 136.000 L 192.000 136.000 L 192.000 160.000 C 191.997 163.238 193.947 166.158 196.938 167.397 C 199.929 168.636 203.372 167.951 205.660 165.660 L 237.660 133.660 C 239.162 132.159 240.006 130.123 240.006 128.000 C 240.006 125.877 239.162 123.841 237.660 122.340 Z"),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
