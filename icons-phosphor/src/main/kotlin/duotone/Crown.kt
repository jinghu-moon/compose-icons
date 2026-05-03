package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = phosphorDuotoneIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.710 99.730 L 201.110 193.320 C 200.465 197.175 197.129 200.000 193.220 200.000 L 62.780 200.000 C 58.871 200.000 55.535 197.175 54.890 193.320 L 39.290 99.730 L 39.370 99.730 C 42.751 99.164 45.928 97.731 48.590 95.570 L 48.590 95.570 L 88.000 144.000 L 120.000 70.350 L 120.000 70.350 C 125.078 72.553 130.842 72.553 135.920 70.350 L 135.920 70.350 L 168.000 144.000 L 207.390 95.520 L 207.390 95.520 C 210.052 97.681 213.229 99.114 216.610 99.680 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 248.000 80.000 C 248.011 67.966 240.331 57.272 228.925 53.436 C 217.519 49.600 204.938 53.482 197.675 63.076 C 190.412 72.671 190.092 85.834 196.880 95.770 L 170.090 128.770 L 146.000 73.400 C 155.000 65.825 158.306 53.433 154.274 42.381 C 150.243 31.330 139.734 23.978 127.970 23.978 C 116.206 23.978 105.697 31.330 101.666 42.381 C 97.634 53.433 100.940 65.825 109.940 73.400 L 85.910 128.740 L 59.120 95.740 C 66.192 85.378 65.508 71.576 57.447 61.964 C 49.385 52.351 35.914 49.274 24.479 54.433 C 13.043 59.592 6.435 71.728 8.306 84.133 C 10.177 96.538 20.071 106.184 32.520 107.740 L 47.000 194.630 C 48.286 202.344 54.959 207.999 62.780 208.000 L 193.220 208.000 C 201.041 207.999 207.714 202.344 209.000 194.630 L 223.470 107.780 C 237.482 106.030 247.998 94.121 248.000 80.000 ZM 128.000 40.000 C 134.627 40.000 140.000 45.373 140.000 52.000 C 140.000 58.627 134.627 64.000 128.000 64.000 C 121.373 64.000 116.000 58.627 116.000 52.000 C 116.000 45.373 121.373 40.000 128.000 40.000 ZM 24.000 80.000 C 24.000 73.373 29.373 68.000 36.000 68.000 C 42.627 68.000 48.000 73.373 48.000 80.000 C 48.000 86.627 42.627 92.000 36.000 92.000 C 29.373 92.000 24.000 86.627 24.000 80.000 ZM 193.220 192.000 L 62.780 192.000 L 48.860 108.520 L 81.790 149.000 C 83.301 150.887 85.583 151.989 88.000 152.000 C 88.361 152.002 88.722 151.978 89.080 151.930 C 91.852 151.553 94.226 149.756 95.340 147.190 L 124.640 79.790 C 126.871 80.070 129.129 80.070 131.360 79.790 L 160.660 147.190 C 161.774 149.756 164.148 151.553 166.920 151.930 C 167.278 151.978 167.639 152.002 168.000 152.000 C 170.417 151.989 172.699 150.887 174.210 149.000 L 207.140 108.480 ZM 220.000 92.000 C 213.373 92.000 208.000 86.627 208.000 80.000 C 208.000 73.373 213.373 68.000 220.000 68.000 C 226.627 68.000 232.000 73.373 232.000 80.000 C 232.000 86.627 226.627 92.000 220.000 92.000 Z"),
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
        return _crown!!
    }

private var _crown: ImageVector? = null
