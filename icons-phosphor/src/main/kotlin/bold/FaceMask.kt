package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorBoldIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 88.000 L 164.000 88.000 C 170.627 88.000 176.000 93.373 176.000 100.000 C 176.000 106.627 170.627 112.000 164.000 112.000 L 92.000 112.000 C 85.373 112.000 80.000 106.627 80.000 100.000 C 80.000 93.373 85.373 88.000 92.000 88.000 ZM 164.000 128.000 L 92.000 128.000 C 85.373 128.000 80.000 133.373 80.000 140.000 C 80.000 146.627 85.373 152.000 92.000 152.000 L 164.000 152.000 C 170.627 152.000 176.000 146.627 176.000 140.000 C 176.000 133.373 170.627 128.000 164.000 128.000 ZM 256.000 104.000 L 256.000 128.000 C 256.000 147.882 239.882 164.000 220.000 164.000 L 213.850 164.000 C 206.630 179.480 193.130 192.870 173.780 203.520 C 160.118 210.905 145.504 216.373 130.350 219.770 C 128.798 220.077 127.202 220.077 125.650 219.770 C 110.496 216.373 95.882 210.905 82.220 203.520 C 62.870 192.870 49.370 179.520 42.150 164.000 L 36.000 164.000 C 16.118 164.000 0.000 147.882 0.000 128.000 L 0.000 104.000 C -0.000 84.118 16.118 68.000 36.000 68.000 L 38.000 68.000 C 40.178 63.544 43.940 60.060 48.550 58.230 L 120.550 29.430 C 125.317 27.510 130.643 27.510 135.410 29.430 L 207.410 58.230 C 212.035 60.052 215.812 63.537 218.000 68.000 L 220.000 68.000 C 239.882 68.000 256.000 84.118 256.000 104.000 ZM 36.130 140.000 C 36.050 138.680 36.000 137.350 36.000 136.000 L 36.000 92.000 C 29.373 92.000 24.000 97.373 24.000 104.000 L 24.000 128.000 C 24.000 134.627 29.373 140.000 36.000 140.000 ZM 196.000 79.510 L 128.000 52.310 L 60.000 79.510 L 60.000 136.000 C 60.000 176.630 115.720 192.650 128.000 195.690 C 140.250 192.690 196.000 176.640 196.000 136.000 ZM 232.000 104.000 C 232.000 97.373 226.627 92.000 220.000 92.000 L 220.000 136.000 C 220.000 137.350 219.950 138.680 219.870 140.000 L 220.000 140.000 C 226.627 140.000 232.000 134.627 232.000 128.000 Z"),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
