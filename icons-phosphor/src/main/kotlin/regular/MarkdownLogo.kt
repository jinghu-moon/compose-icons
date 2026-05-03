package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorRegularIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 48.000 L 24.000 48.000 C 15.163 48.000 8.000 55.163 8.000 64.000 L 8.000 192.000 C 8.000 200.837 15.163 208.000 24.000 208.000 L 232.000 208.000 C 240.837 208.000 248.000 200.837 248.000 192.000 L 248.000 64.000 C 248.000 55.163 240.837 48.000 232.000 48.000 ZM 232.000 192.000 L 24.000 192.000 L 24.000 64.000 L 232.000 64.000 L 232.000 192.000 ZM 128.000 104.000 L 128.000 152.000 C 128.000 156.418 124.418 160.000 120.000 160.000 C 115.582 160.000 112.000 156.418 112.000 152.000 L 112.000 123.310 L 93.660 141.660 C 92.159 143.162 90.123 144.006 88.000 144.006 C 85.877 144.006 83.841 143.162 82.340 141.660 L 64.000 123.310 L 64.000 152.000 C 64.000 156.418 60.418 160.000 56.000 160.000 C 51.582 160.000 48.000 156.418 48.000 152.000 L 48.000 104.000 C 47.997 100.762 49.947 97.842 52.938 96.603 C 55.929 95.364 59.372 96.049 61.660 98.340 L 88.000 124.690 L 114.340 98.340 C 116.628 96.049 120.071 95.364 123.062 96.603 C 126.053 97.842 128.003 100.762 128.000 104.000 ZM 205.660 122.340 C 207.162 123.841 208.006 125.877 208.006 128.000 C 208.006 130.123 207.162 132.159 205.660 133.660 L 181.660 157.660 C 180.159 159.162 178.123 160.006 176.000 160.006 C 173.877 160.006 171.841 159.162 170.340 157.660 L 146.340 133.660 C 143.214 130.534 143.214 125.466 146.340 122.340 C 149.466 119.214 154.534 119.214 157.660 122.340 L 168.000 132.690 L 168.000 104.000 C 168.000 99.582 171.582 96.000 176.000 96.000 C 180.418 96.000 184.000 99.582 184.000 104.000 L 184.000 132.690 L 194.340 122.340 C 195.841 120.838 197.877 119.994 200.000 119.994 C 202.123 119.994 204.159 120.838 205.660 122.340 Z"),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
