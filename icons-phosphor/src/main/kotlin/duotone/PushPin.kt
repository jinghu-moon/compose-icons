package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorDuotoneIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 229.660 98.340 L 172.390 155.800 C 183.850 178.730 170.670 201.660 162.280 212.800 C 160.884 214.632 158.766 215.774 156.468 215.933 C 154.170 216.092 151.915 215.253 150.280 213.630 L 42.340 105.760 C 40.729 104.151 39.880 101.931 40.006 99.657 C 40.132 97.384 41.221 95.271 43.000 93.850 C 72.650 69.930 100.400 83.850 100.400 83.850 L 157.670 26.390 C 160.794 23.268 165.856 23.268 168.980 26.390 L 229.660 87.000 C 231.168 88.501 232.016 90.542 232.016 92.670 C 232.016 94.798 231.168 96.839 229.660 98.340 Z"),
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
                pathData = parseSvgPathData("M 235.320 81.370 L 174.630 20.690 C 171.629 17.689 167.559 16.002 163.315 16.002 C 159.071 16.002 155.001 17.689 152.000 20.690 L 98.370 74.490 C 87.710 71.150 63.370 67.120 37.970 87.630 C 34.429 90.477 32.266 94.695 32.020 99.232 C 31.774 103.769 33.468 108.197 36.680 111.410 L 85.000 159.710 L 42.340 202.340 C 39.214 205.466 39.214 210.534 42.340 213.660 C 45.466 216.786 50.534 216.786 53.660 213.660 L 96.290 171.000 L 144.580 219.290 C 147.578 222.301 151.651 223.995 155.900 224.000 C 156.280 224.000 156.650 224.000 157.030 224.000 C 161.645 223.680 165.893 221.370 168.670 217.670 C 188.310 191.570 186.420 170.350 181.860 157.670 L 235.330 104.000 C 238.330 100.998 240.014 96.927 240.013 92.683 C 240.011 88.439 238.323 84.369 235.320 81.370 ZM 224.000 92.690 L 224.000 92.690 L 166.730 150.150 C 164.305 152.584 163.705 156.296 165.240 159.370 C 174.700 178.300 163.440 197.960 155.900 207.990 L 48.000 100.080 C 60.080 90.340 71.640 87.770 80.480 87.770 C 86.089 87.693 91.652 88.794 96.810 91.000 C 99.896 92.545 103.625 91.936 106.060 89.490 L 163.320 32.000 L 224.000 92.680 Z"),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
