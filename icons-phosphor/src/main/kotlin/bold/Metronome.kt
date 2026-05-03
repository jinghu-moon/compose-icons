package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorBoldIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.050 201.940 L 191.650 115.820 L 216.880 88.070 C 221.241 83.154 220.837 75.645 215.974 71.226 C 211.111 66.806 203.598 67.120 199.120 71.930 L 183.240 89.390 L 168.140 41.940 C 165.520 33.625 157.799 27.977 149.080 28.000 L 106.910 28.000 C 98.191 27.977 90.470 33.625 87.850 41.940 L 36.940 201.940 C 35.007 208.020 36.090 214.657 39.857 219.807 C 43.623 224.956 49.620 228.000 56.000 228.000 L 200.000 228.000 C 206.380 228.000 212.377 224.956 216.143 219.807 C 219.910 214.657 220.993 208.020 219.060 201.940 ZM 179.250 156.000 L 155.120 156.000 L 173.000 136.340 ZM 109.830 52.000 L 146.160 52.000 L 164.580 109.910 L 122.690 156.000 L 76.740 156.000 ZM 61.470 204.000 L 69.100 180.000 L 186.890 180.000 L 194.520 204.000 Z"),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
