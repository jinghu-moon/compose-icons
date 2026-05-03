package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorThinIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 72.000 140.000 L 32.000 140.000 C 29.791 140.000 28.000 138.209 28.000 136.000 C 28.000 133.791 29.791 132.000 32.000 132.000 L 69.860 132.000 L 84.670 109.780 C 85.412 108.666 86.661 107.996 88.000 107.996 C 89.339 107.996 90.588 108.666 91.330 109.780 L 120.000 152.780 L 132.670 133.780 C 133.412 132.667 134.662 131.999 136.000 132.000 L 160.000 132.000 C 162.209 132.000 164.000 133.791 164.000 136.000 C 164.000 138.209 162.209 140.000 160.000 140.000 L 138.140 140.000 L 123.330 162.220 C 122.588 163.334 121.339 164.004 120.000 164.004 C 118.661 164.004 117.412 163.334 116.670 162.220 L 88.000 119.210 L 75.330 138.210 C 74.590 139.327 73.340 139.999 72.000 140.000 ZM 178.000 44.000 C 156.560 44.000 138.080 54.190 128.000 71.070 C 117.920 54.190 99.440 44.000 78.000 44.000 C 45.983 44.039 20.039 69.983 20.000 102.000 Q 20.000 103.060 20.000 104.130 C 20.072 106.339 21.921 108.072 24.130 108.000 C 26.339 107.928 28.072 106.079 28.000 103.870 C 28.000 103.250 28.000 102.630 28.000 102.000 C 28.033 74.399 50.399 52.033 78.000 52.000 C 99.110 52.000 116.850 63.310 124.300 81.510 C 124.916 83.010 126.378 83.990 128.000 83.990 C 129.622 83.990 131.084 83.010 131.700 81.510 C 139.150 63.310 156.890 52.000 178.000 52.000 C 205.601 52.033 227.967 74.399 228.000 102.000 C 228.000 160.000 142.000 211.460 128.000 219.420 C 119.530 214.600 84.500 193.810 58.370 165.300 C 56.867 163.727 54.383 163.644 52.778 165.113 C 51.173 166.582 51.036 169.064 52.470 170.700 C 83.190 204.220 124.370 226.590 126.100 227.520 C 127.286 228.160 128.714 228.160 129.900 227.520 C 148.607 216.999 166.255 204.699 182.600 190.790 C 218.000 160.470 236.000 130.590 236.000 102.000 C 235.961 69.983 210.017 44.039 178.000 44.000 Z"),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
