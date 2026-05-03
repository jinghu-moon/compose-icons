package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorBoldIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 71.760 148.000 L 31.700 148.000 C 25.073 148.000 19.700 142.627 19.700 136.000 C 19.700 129.373 25.073 124.000 31.700 124.000 L 65.330 124.000 L 77.780 105.340 C 80.003 101.988 83.758 99.973 87.780 99.973 C 91.802 99.973 95.557 101.988 97.780 105.340 L 119.780 138.340 L 125.780 129.340 C 128.009 125.998 131.763 123.994 135.780 124.000 L 159.780 124.000 C 166.407 124.000 171.780 129.373 171.780 136.000 C 171.780 142.627 166.407 148.000 159.780 148.000 L 142.180 148.000 L 129.720 166.660 C 127.497 170.012 123.742 172.027 119.720 172.027 C 115.698 172.027 111.943 170.012 109.720 166.660 L 87.720 133.660 L 81.720 142.660 C 79.498 145.990 75.763 147.993 71.760 148.000 ZM 177.910 36.000 C 157.790 36.000 139.910 43.930 127.840 57.560 C 115.740 43.930 97.890 36.000 77.760 36.000 C 44.105 35.950 15.803 61.232 12.070 94.680 C 11.341 101.288 16.107 107.236 22.715 107.965 C 29.323 108.694 35.271 103.928 36.000 97.320 C 38.384 76.060 56.367 59.989 77.760 60.000 C 95.590 60.000 110.510 69.400 116.710 84.540 C 118.543 89.074 122.944 92.042 127.835 92.042 C 132.726 92.042 137.127 89.074 138.960 84.540 C 145.160 69.400 160.080 60.000 177.910 60.000 C 201.123 59.994 219.956 78.787 220.000 102.000 C 220.000 131.420 194.140 159.770 172.440 178.360 C 158.490 190.184 143.578 200.824 127.860 210.170 C 116.990 203.720 92.490 188.170 71.350 167.440 C 66.622 162.790 59.020 162.852 54.370 167.580 C 49.720 172.308 49.782 179.910 54.510 184.560 C 84.900 214.370 120.660 233.760 122.170 234.560 C 125.728 236.466 130.003 236.466 133.560 234.560 C 138.000 232.140 244.000 174.340 244.000 102.000 C 243.934 65.542 214.369 36.016 177.910 36.000 Z"),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
