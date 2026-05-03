package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorRegularIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.440 105.340 L 116.440 73.340 C 113.985 71.702 110.826 71.549 108.224 72.942 C 105.622 74.335 103.998 77.048 104.000 80.000 L 104.000 144.000 C 103.998 146.952 105.622 149.665 108.224 151.058 C 110.826 152.451 113.985 152.298 116.440 150.660 L 164.440 118.660 C 166.669 117.177 168.008 114.677 168.008 112.000 C 168.008 109.323 166.669 106.823 164.440 105.340 ZM 120.000 129.050 L 120.000 95.000 L 145.580 112.000 ZM 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 168.000 C 24.000 176.837 31.163 184.000 40.000 184.000 L 216.000 184.000 C 224.837 184.000 232.000 176.837 232.000 168.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 168.000 L 40.000 168.000 L 40.000 56.000 L 216.000 56.000 L 216.000 168.000 ZM 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 32.000 216.000 C 27.582 216.000 24.000 212.418 24.000 208.000 C 24.000 203.582 27.582 200.000 32.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
