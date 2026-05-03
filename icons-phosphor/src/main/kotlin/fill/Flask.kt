package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorFillIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.690 199.770 L 160.000 96.920 L 160.000 40.000 L 168.000 40.000 C 172.418 40.000 176.000 36.418 176.000 32.000 C 176.000 27.582 172.418 24.000 168.000 24.000 L 88.000 24.000 C 83.582 24.000 80.000 27.582 80.000 32.000 C 80.000 36.418 83.582 40.000 88.000 40.000 L 96.000 40.000 L 96.000 96.920 L 34.310 199.770 C 31.348 204.708 31.268 210.857 34.101 215.871 C 36.933 220.884 42.242 223.989 48.000 224.000 L 208.000 224.000 C 213.764 224.000 219.082 220.899 221.922 215.884 C 224.762 210.868 224.685 204.713 221.720 199.770 ZM 131.610 156.860 C 115.700 148.810 100.560 144.540 86.390 144.050 L 110.860 103.250 C 111.608 102.010 112.002 100.588 112.000 99.140 L 112.000 40.000 L 144.000 40.000 L 144.000 99.140 C 143.998 100.588 144.392 102.010 145.140 103.250 L 183.360 167.000 C 171.400 169.340 154.290 168.340 131.610 156.860 Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
