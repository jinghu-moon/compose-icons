package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorRegularIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 40.000 L 48.000 40.000 C 34.745 40.000 24.000 50.745 24.000 64.000 L 24.000 176.000 C 24.000 189.255 34.745 200.000 48.000 200.000 L 208.000 200.000 C 221.255 200.000 232.000 189.255 232.000 176.000 L 232.000 64.000 C 232.000 50.745 221.255 40.000 208.000 40.000 ZM 216.000 176.000 C 216.000 180.418 212.418 184.000 208.000 184.000 L 48.000 184.000 C 43.582 184.000 40.000 180.418 40.000 176.000 L 40.000 64.000 C 40.000 59.582 43.582 56.000 48.000 56.000 L 208.000 56.000 C 212.418 56.000 216.000 59.582 216.000 64.000 ZM 168.000 224.000 C 168.000 228.418 164.418 232.000 160.000 232.000 L 96.000 232.000 C 91.582 232.000 88.000 228.418 88.000 224.000 C 88.000 219.582 91.582 216.000 96.000 216.000 L 160.000 216.000 C 164.418 216.000 168.000 219.582 168.000 224.000 ZM 164.440 113.340 L 116.440 81.340 C 113.985 79.702 110.826 79.549 108.224 80.942 C 105.622 82.335 103.998 85.048 104.000 88.000 L 104.000 152.000 C 103.998 154.952 105.622 157.665 108.224 159.058 C 110.826 160.451 113.985 160.298 116.440 158.660 L 164.440 126.660 C 166.669 125.177 168.008 122.677 168.008 120.000 C 168.008 117.323 166.669 114.823 164.440 113.340 ZM 120.000 137.050 L 120.000 103.000 L 145.580 120.000 Z"),
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
