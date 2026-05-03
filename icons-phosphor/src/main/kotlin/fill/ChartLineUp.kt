package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorFillIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 200.000 192.000 L 56.000 192.000 C 51.582 192.000 48.000 188.418 48.000 184.000 L 48.000 72.000 C 48.000 67.582 51.582 64.000 56.000 64.000 C 60.418 64.000 64.000 67.582 64.000 72.000 L 64.000 148.690 L 98.340 114.340 C 99.841 112.838 101.877 111.994 104.000 111.994 C 106.123 111.994 108.159 112.838 109.660 114.340 L 128.000 132.690 L 172.690 88.000 L 144.000 88.000 C 139.582 88.000 136.000 84.418 136.000 80.000 C 136.000 75.582 139.582 72.000 144.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 L 200.000 128.000 C 200.000 132.418 196.418 136.000 192.000 136.000 C 187.582 136.000 184.000 132.418 184.000 128.000 L 184.000 99.310 L 133.660 149.660 C 132.159 151.162 130.123 152.006 128.000 152.006 C 125.877 152.006 123.841 151.162 122.340 149.660 L 104.000 131.310 L 64.000 171.310 L 64.000 176.000 L 200.000 176.000 C 204.418 176.000 208.000 179.582 208.000 184.000 C 208.000 188.418 204.418 192.000 200.000 192.000 Z"),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
