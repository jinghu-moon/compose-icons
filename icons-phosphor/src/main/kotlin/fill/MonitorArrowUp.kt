package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MonitorArrowUp: ImageVector
    get() {
        if (_monitorArrowUp != null) return _monitorArrowUp!!
        _monitorArrowUp = phosphorFillIcon(
            name = "MonitorArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 224.000 C 168.000 228.418 164.418 232.000 160.000 232.000 L 96.000 232.000 C 91.582 232.000 88.000 228.418 88.000 224.000 C 88.000 219.582 91.582 216.000 96.000 216.000 L 160.000 216.000 C 164.418 216.000 168.000 219.582 168.000 224.000 ZM 232.000 64.000 L 232.000 176.000 C 232.000 189.255 221.255 200.000 208.000 200.000 L 48.000 200.000 C 34.745 200.000 24.000 189.255 24.000 176.000 L 24.000 64.000 C 24.000 50.745 34.745 40.000 48.000 40.000 L 208.000 40.000 C 221.255 40.000 232.000 50.745 232.000 64.000 ZM 157.660 106.340 L 133.660 82.340 C 132.159 80.838 130.123 79.994 128.000 79.994 C 125.877 79.994 123.841 80.838 122.340 82.340 L 98.340 106.340 C 95.214 109.466 95.214 114.534 98.340 117.660 C 101.466 120.786 106.534 120.786 109.660 117.660 L 120.000 107.310 L 120.000 152.000 C 120.000 156.418 123.582 160.000 128.000 160.000 C 132.418 160.000 136.000 156.418 136.000 152.000 L 136.000 107.310 L 146.340 117.660 C 149.466 120.786 154.534 120.786 157.660 117.660 C 160.786 114.534 160.786 109.466 157.660 106.340 Z"),
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
        return _monitorArrowUp!!
    }

private var _monitorArrowUp: ImageVector? = null
