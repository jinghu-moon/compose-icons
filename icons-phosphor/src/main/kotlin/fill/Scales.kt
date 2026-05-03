package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorFillIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.430 133.000 L 207.430 53.000 C 206.206 49.973 203.265 47.994 200.000 48.000 C 199.418 48.009 198.838 48.079 198.270 48.210 L 136.000 62.000 L 136.000 40.000 C 136.000 35.582 132.418 32.000 128.000 32.000 C 123.582 32.000 120.000 35.582 120.000 40.000 L 120.000 65.580 L 54.270 80.210 C 51.698 80.771 49.566 82.563 48.570 85.000 L 16.570 165.000 C 16.187 165.954 15.994 166.972 16.000 168.000 C 16.000 191.310 40.540 200.000 56.000 200.000 C 71.460 200.000 96.000 191.310 96.000 168.000 C 96.006 166.972 95.813 165.954 95.430 165.000 L 66.920 93.770 L 120.000 82.000 L 120.000 208.000 L 104.000 208.000 C 99.582 208.000 96.000 211.582 96.000 216.000 C 96.000 220.418 99.582 224.000 104.000 224.000 L 152.000 224.000 C 156.418 224.000 160.000 220.418 160.000 216.000 C 160.000 211.582 156.418 208.000 152.000 208.000 L 136.000 208.000 L 136.000 78.420 L 187.000 67.100 L 160.570 133.000 C 160.187 133.954 159.994 134.972 160.000 136.000 C 160.000 159.310 184.540 168.000 200.000 168.000 C 215.460 168.000 240.000 159.310 240.000 136.000 C 240.006 134.972 239.813 133.954 239.430 133.000 ZM 79.430 168.000 L 32.620 168.000 L 56.000 109.540 ZM 176.670 136.000 L 200.000 77.540 L 223.380 136.000 Z"),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
