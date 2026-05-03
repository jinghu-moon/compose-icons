package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorFillIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 160.000 C 240.001 143.361 227.250 129.498 210.669 128.110 C 194.088 126.722 179.210 138.272 176.445 154.680 C 173.680 171.088 183.950 186.877 200.070 191.000 C 200.026 191.332 200.002 191.666 200.000 192.000 C 200.000 209.673 185.673 224.000 168.000 224.000 L 144.000 224.000 C 126.327 224.000 112.000 209.673 112.000 192.000 L 112.000 151.480 C 143.470 147.480 168.000 120.010 168.000 87.170 L 168.000 40.000 C 168.000 35.582 164.418 32.000 160.000 32.000 L 136.000 32.000 C 131.582 32.000 128.000 35.582 128.000 40.000 C 128.000 44.418 131.582 48.000 136.000 48.000 L 152.000 48.000 L 152.000 87.170 C 152.000 113.750 130.750 135.660 104.640 136.000 C 91.799 136.171 79.425 131.190 70.284 122.169 C 61.144 113.149 55.999 100.842 56.000 88.000 L 56.000 48.000 L 72.000 48.000 C 76.418 48.000 80.000 44.418 80.000 40.000 C 80.000 35.582 76.418 32.000 72.000 32.000 L 48.000 32.000 C 43.582 32.000 40.000 35.582 40.000 40.000 L 40.000 88.000 C 40.004 120.250 64.003 147.459 96.000 151.490 L 96.000 192.000 C 96.028 218.498 117.502 239.972 144.000 240.000 L 168.000 240.000 C 194.498 239.972 215.972 218.498 216.000 192.000 C 215.998 191.666 215.974 191.332 215.930 191.000 C 230.092 187.377 239.999 174.618 240.000 160.000 ZM 208.000 168.000 C 203.582 168.000 200.000 164.418 200.000 160.000 C 200.000 155.582 203.582 152.000 208.000 152.000 C 212.418 152.000 216.000 155.582 216.000 160.000 C 216.000 164.418 212.418 168.000 208.000 168.000 Z"),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
