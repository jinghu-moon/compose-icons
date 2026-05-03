package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorBoldIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.630 70.000 C 224.614 66.094 214.977 68.021 209.080 74.710 L 179.560 106.530 L 146.220 31.760 L 146.160 31.620 C 142.891 24.536 135.802 19.999 128.000 19.999 C 120.198 19.999 113.109 24.536 109.840 31.620 L 109.780 31.760 L 76.440 106.520 L 46.920 74.700 C 40.962 68.043 31.312 66.144 23.276 70.048 C 15.241 73.952 10.769 82.712 12.320 91.510 C 12.320 91.670 12.380 91.820 12.410 91.980 L 35.070 195.760 C 36.874 205.183 45.115 211.998 54.710 212.000 L 201.290 212.000 C 210.885 211.998 219.126 205.183 220.930 195.760 L 243.590 92.000 C 243.590 91.840 243.660 91.690 243.680 91.530 C 245.314 82.677 240.776 73.834 232.630 70.000 ZM 198.060 188.000 L 57.940 188.000 L 39.060 101.510 L 71.200 136.160 C 73.939 139.135 77.993 140.530 81.983 139.871 C 85.973 139.212 89.363 136.588 91.000 132.890 L 128.000 49.820 L 165.000 132.890 C 166.642 136.572 170.023 139.183 174.000 139.841 C 177.977 140.499 182.019 139.116 184.760 136.160 L 216.900 101.510 Z"),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
