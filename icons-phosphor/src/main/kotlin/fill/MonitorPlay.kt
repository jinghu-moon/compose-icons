package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorFillIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 224.000 C 168.000 228.418 164.418 232.000 160.000 232.000 L 96.000 232.000 C 91.582 232.000 88.000 228.418 88.000 224.000 C 88.000 219.582 91.582 216.000 96.000 216.000 L 160.000 216.000 C 164.418 216.000 168.000 219.582 168.000 224.000 ZM 232.000 64.000 L 232.000 176.000 C 232.000 189.255 221.255 200.000 208.000 200.000 L 48.000 200.000 C 34.745 200.000 24.000 189.255 24.000 176.000 L 24.000 64.000 C 24.000 50.745 34.745 40.000 48.000 40.000 L 208.000 40.000 C 221.255 40.000 232.000 50.745 232.000 64.000 ZM 164.000 120.000 C 163.999 117.391 162.727 114.947 160.590 113.450 L 120.590 85.450 C 118.147 83.738 114.954 83.528 112.308 84.905 C 109.661 86.282 108.001 89.017 108.000 92.000 L 108.000 148.000 C 108.001 150.983 109.661 153.718 112.308 155.095 C 114.954 156.472 118.147 156.262 120.590 154.550 L 160.590 126.550 C 162.727 125.053 163.999 122.609 164.000 120.000 Z"),
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
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
