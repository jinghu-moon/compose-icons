package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorBoldIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.270 211.900 L 168.770 73.000 L 176.400 52.000 L 184.000 52.000 C 190.627 52.000 196.000 46.627 196.000 40.000 C 196.000 33.373 190.627 28.000 184.000 28.000 L 88.000 28.000 C 81.622 28.045 76.394 33.072 76.098 39.444 C 75.803 45.815 80.543 51.305 86.890 51.940 L 28.730 211.940 C 26.470 218.164 29.679 225.042 35.900 227.310 C 37.215 227.780 38.603 228.014 40.000 228.000 C 45.047 228.001 49.556 224.843 51.280 220.100 L 60.000 196.000 L 98.500 196.000 L 92.720 211.900 C 90.461 218.127 93.675 225.006 99.900 227.270 C 101.213 227.755 102.601 228.002 104.000 228.000 C 109.047 228.001 113.556 224.843 115.280 220.100 L 132.770 172.000 L 179.230 172.000 L 196.720 220.100 C 198.444 224.843 202.953 228.001 208.000 228.000 C 209.399 228.001 210.787 227.754 212.100 227.270 C 218.321 225.002 221.530 218.124 219.270 211.900 ZM 124.690 124.000 L 86.220 124.000 L 95.000 100.000 L 133.460 100.000 ZM 142.140 76.000 L 103.680 76.000 L 112.410 52.000 L 150.870 52.000 ZM 68.770 172.000 L 77.500 148.000 L 116.000 148.000 L 107.270 172.000 ZM 141.500 148.000 L 156.000 108.110 L 170.500 148.000 Z"),
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
        return _ladder!!
    }

private var _ladder: ImageVector? = null
