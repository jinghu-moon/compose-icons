package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorRegularIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 32.000 216.000 C 27.582 216.000 24.000 212.418 24.000 208.000 L 24.000 48.000 C 24.000 43.582 27.582 40.000 32.000 40.000 C 36.418 40.000 40.000 43.582 40.000 48.000 L 40.000 156.690 L 90.340 106.340 C 91.841 104.838 93.877 103.994 96.000 103.994 C 98.123 103.994 100.159 104.838 101.660 106.340 L 128.000 132.690 L 180.690 80.000 L 160.000 80.000 C 155.582 80.000 152.000 76.418 152.000 72.000 C 152.000 67.582 155.582 64.000 160.000 64.000 L 200.000 64.000 C 204.418 64.000 208.000 67.582 208.000 72.000 L 208.000 112.000 C 208.000 116.418 204.418 120.000 200.000 120.000 C 195.582 120.000 192.000 116.418 192.000 112.000 L 192.000 91.310 L 133.660 149.660 C 132.159 151.162 130.123 152.006 128.000 152.006 C 125.877 152.006 123.841 151.162 122.340 149.660 L 96.000 123.310 L 40.000 179.310 L 40.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 Z"),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
