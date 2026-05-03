package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorDuotoneIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 222.400 145.550 C 221.489 150.459 220.198 155.290 218.540 160.000 L 165.540 160.000 C 162.202 159.996 159.212 162.065 158.040 165.190 L 136.140 223.660 C 133.450 223.880 130.730 224.000 127.990 224.000 C 125.250 224.000 122.490 223.880 119.790 223.650 L 97.940 165.200 C 96.772 162.074 93.787 160.002 90.450 160.000 L 37.450 160.000 C 35.792 155.290 34.501 150.459 33.590 145.550 C 57.836 119.072 92.088 103.994 127.990 103.994 C 163.892 103.994 198.144 119.072 222.390 145.550 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 128.000 152.000 C 121.373 152.000 116.000 146.627 116.000 140.000 C 116.000 133.373 121.373 128.000 128.000 128.000 C 134.627 128.000 140.000 133.373 140.000 140.000 C 140.000 146.627 134.627 152.000 128.000 152.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 40.000 128.000 L 40.000 128.330 C 90.748 85.223 165.252 85.223 216.000 128.330 L 216.000 128.000 C 216.000 79.399 176.601 40.000 128.000 40.000 C 79.399 40.000 40.000 79.399 40.000 128.000 ZM 107.500 213.580 L 90.450 168.000 L 49.630 168.000 C 61.364 190.894 82.494 207.537 107.500 213.580 ZM 128.000 216.000 C 128.830 216.000 129.660 216.000 130.490 216.000 L 150.560 162.430 C 152.918 156.189 158.888 152.054 165.560 152.040 L 212.680 152.040 C 213.060 150.730 213.400 149.400 213.680 148.040 C 191.110 125.013 160.223 112.037 127.980 112.037 C 95.737 112.037 64.850 125.013 42.280 148.040 C 42.590 149.380 42.930 150.710 43.280 152.040 L 90.450 152.040 C 97.124 152.058 103.093 156.196 105.450 162.440 L 125.450 216.000 C 126.310 216.000 127.150 216.000 128.000 216.000 ZM 206.370 168.000 L 165.550 168.000 L 148.460 213.590 C 173.483 207.556 194.631 190.908 206.370 168.000 Z"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
