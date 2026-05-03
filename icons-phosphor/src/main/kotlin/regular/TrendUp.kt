package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrendUp: ImageVector
    get() {
        if (_trendUp != null) return _trendUp!!
        _trendUp = phosphorRegularIcon(
            name = "TrendUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 56.000 L 240.000 120.000 C 240.000 124.418 236.418 128.000 232.000 128.000 C 227.582 128.000 224.000 124.418 224.000 120.000 L 224.000 75.310 L 141.660 157.660 C 140.159 159.162 138.123 160.006 136.000 160.006 C 133.877 160.006 131.841 159.162 130.340 157.660 L 96.000 123.310 L 29.660 189.660 C 26.534 192.786 21.466 192.786 18.340 189.660 C 15.214 186.534 15.214 181.466 18.340 178.340 L 90.340 106.340 C 91.841 104.838 93.877 103.994 96.000 103.994 C 98.123 103.994 100.159 104.838 101.660 106.340 L 136.000 140.690 L 212.690 64.000 L 168.000 64.000 C 163.582 64.000 160.000 60.418 160.000 56.000 C 160.000 51.582 163.582 48.000 168.000 48.000 L 232.000 48.000 C 236.418 48.000 240.000 51.582 240.000 56.000 Z"),
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
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null
