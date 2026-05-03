package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorBoldIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.150 197.710 L 164.000 95.810 L 164.000 44.000 L 168.000 44.000 C 174.627 44.000 180.000 38.627 180.000 32.000 C 180.000 25.373 174.627 20.000 168.000 20.000 L 88.000 20.000 C 81.373 20.000 76.000 25.373 76.000 32.000 C 76.000 38.627 81.373 44.000 88.000 44.000 L 92.000 44.000 L 92.000 95.810 L 30.850 197.710 C 27.143 203.889 27.046 211.584 30.596 217.854 C 34.146 224.124 40.795 228.000 48.000 228.000 L 208.000 228.000 C 215.205 228.000 221.854 224.124 225.404 217.854 C 228.954 211.584 228.857 203.889 225.150 197.710 ZM 140.000 44.000 L 140.000 99.140 C 140.001 101.314 140.592 103.446 141.710 105.310 L 176.840 163.850 C 166.050 164.710 151.690 162.540 133.420 153.290 C 119.420 146.210 105.960 141.960 93.150 140.530 L 114.290 105.310 C 115.408 103.446 115.999 101.314 116.000 99.140 L 116.000 44.000 ZM 55.060 204.000 L 79.000 164.190 C 92.000 163.080 106.620 166.610 122.620 174.710 C 142.230 184.630 158.870 188.020 172.470 188.020 C 178.409 188.043 184.330 187.365 190.110 186.000 L 200.940 204.000 Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
