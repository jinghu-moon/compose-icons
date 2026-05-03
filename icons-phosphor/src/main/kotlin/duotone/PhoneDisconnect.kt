package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorDuotoneIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 230.000 157.000 C 227.803 159.786 224.033 160.791 220.740 159.470 L 171.580 142.000 C 169.090 141.003 167.265 138.826 166.720 136.200 L 160.510 106.460 C 159.952 103.727 158.001 101.487 155.370 100.560 C 137.506 94.437 118.105 94.483 100.270 100.690 C 97.619 101.639 95.670 103.923 95.150 106.690 L 89.250 136.200 C 88.703 138.828 86.874 141.006 84.380 142.000 L 35.290 159.420 C 32.000 160.767 28.215 159.781 26.000 157.000 C 11.400 138.170 12.740 113.170 30.000 95.880 C 83.110 42.770 172.770 42.770 225.880 95.880 C 243.230 113.120 244.570 138.120 230.000 157.000 Z"),
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
                pathData = parseSvgPathData("M 231.590 90.130 L 231.590 90.130 C 175.440 34.000 80.560 34.000 24.410 90.130 C 4.410 110.130 2.490 139.620 19.720 161.840 C 22.755 165.731 27.415 168.004 32.350 168.000 C 34.317 168.001 36.267 167.635 38.100 166.920 L 87.100 149.550 L 87.390 149.440 C 92.415 147.430 96.083 143.017 97.140 137.710 L 103.040 108.190 C 119.127 102.629 136.609 102.590 152.720 108.080 L 152.720 108.080 L 158.930 137.830 C 160.024 143.078 163.673 147.429 168.650 149.420 L 168.940 149.530 L 217.940 166.920 C 224.512 169.466 231.977 167.411 236.320 161.860 C 253.510 139.620 251.580 110.130 231.590 90.130 ZM 223.670 152.000 L 223.370 151.880 L 174.550 134.550 L 168.340 104.810 C 167.194 99.337 163.274 94.859 158.000 93.000 C 138.437 86.302 117.194 86.348 97.660 93.130 C 92.344 95.029 88.422 99.590 87.340 105.130 L 81.440 134.640 L 32.630 151.860 C 32.530 151.860 32.460 151.990 32.360 152.030 C 20.030 136.120 21.360 115.800 35.720 101.450 C 60.720 76.450 94.370 63.920 128.000 63.920 C 161.630 63.920 195.270 76.430 220.280 101.450 C 234.610 115.800 236.000 136.120 223.670 152.000 ZM 223.990 200.000 C 223.990 204.418 220.408 208.000 215.990 208.000 L 40.000 208.000 C 35.582 208.000 32.000 204.418 32.000 200.000 C 32.000 195.582 35.582 192.000 40.000 192.000 L 216.000 192.000 C 220.418 192.000 224.000 195.582 224.000 200.000 Z"),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
