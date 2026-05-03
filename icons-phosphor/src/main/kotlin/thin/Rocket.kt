package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = phosphorThinIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.000 224.000 C 148.000 226.209 146.209 228.000 144.000 228.000 L 112.000 228.000 C 109.791 228.000 108.000 226.209 108.000 224.000 C 108.000 221.791 109.791 220.000 112.000 220.000 L 144.000 220.000 C 146.209 220.000 148.000 221.791 148.000 224.000 ZM 128.000 108.000 C 132.418 108.000 136.000 104.418 136.000 100.000 C 136.000 95.582 132.418 92.000 128.000 92.000 C 123.582 92.000 120.000 95.582 120.000 100.000 C 120.000 104.418 123.582 108.000 128.000 108.000 ZM 219.720 155.000 L 207.350 210.600 C 206.469 214.650 203.544 217.949 199.630 219.310 C 198.345 219.762 196.993 219.996 195.630 220.000 C 192.931 219.998 190.312 219.082 188.200 217.400 L 159.850 196.000 L 96.150 196.000 L 67.810 217.400 C 65.698 219.082 63.079 219.998 60.380 220.000 C 59.017 219.996 57.665 219.762 56.380 219.310 C 52.466 217.949 49.541 214.650 48.660 210.600 L 36.280 155.000 C 35.476 151.371 36.400 147.575 38.780 144.720 L 68.130 109.490 C 71.430 56.160 109.960 22.810 120.650 14.550 C 124.977 11.198 131.023 11.198 135.350 14.550 C 146.040 22.810 184.570 56.160 187.870 109.490 L 217.220 144.720 C 219.600 147.575 220.524 151.371 219.720 155.000 ZM 97.110 188.000 L 158.890 188.000 C 214.070 92.490 145.000 32.050 130.460 20.840 C 129.014 19.712 126.986 19.712 125.540 20.840 C 111.000 32.050 41.930 92.490 97.110 188.000 ZM 89.590 190.930 C 75.120 165.560 68.930 142.520 68.000 122.060 L 44.920 149.800 C 44.127 150.753 43.820 152.020 44.090 153.230 L 56.450 208.860 C 56.747 210.211 57.722 211.313 59.026 211.773 C 60.331 212.233 61.781 211.986 62.860 211.120 L 62.950 211.050 ZM 211.080 149.800 L 188.000 122.060 C 187.110 142.520 180.920 165.560 166.450 190.930 L 193.090 211.050 L 193.180 211.120 C 194.259 211.986 195.709 212.233 197.014 211.773 C 198.318 211.313 199.293 210.211 199.590 208.860 L 211.950 153.230 C 212.209 152.014 211.887 150.746 211.080 149.800 Z"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
