package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorFillIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 200.000 192.000 L 56.000 192.000 C 51.582 192.000 48.000 188.418 48.000 184.000 L 48.000 72.000 C 48.000 67.582 51.582 64.000 56.000 64.000 C 60.418 64.000 64.000 67.582 64.000 72.000 L 64.000 92.690 L 96.000 124.690 L 130.340 90.340 C 131.841 88.838 133.877 87.994 136.000 87.994 C 138.123 87.994 140.159 88.838 141.660 90.340 L 176.000 124.690 L 176.000 104.000 C 176.000 99.582 179.582 96.000 184.000 96.000 C 188.418 96.000 192.000 99.582 192.000 104.000 L 192.000 144.000 C 192.000 148.418 188.418 152.000 184.000 152.000 L 144.000 152.000 C 139.582 152.000 136.000 148.418 136.000 144.000 C 136.000 139.582 139.582 136.000 144.000 136.000 L 164.690 136.000 L 136.000 107.310 L 101.660 141.660 C 100.159 143.162 98.123 144.006 96.000 144.006 C 93.877 144.006 91.841 143.162 90.340 141.660 L 64.000 115.310 L 64.000 176.000 L 200.000 176.000 C 204.418 176.000 208.000 179.582 208.000 184.000 C 208.000 188.418 204.418 192.000 200.000 192.000 Z"),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
