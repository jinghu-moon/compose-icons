package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorDuotoneIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 80.000 L 208.000 96.000 L 208.000 120.000 C 208.000 173.019 165.019 216.000 112.000 216.000 L 24.000 216.000 C 20.923 216.002 18.118 214.239 16.785 211.466 C 15.452 208.693 15.827 205.402 17.750 203.000 L 104.000 99.520 L 104.000 76.890 C 104.000 48.120 127.000 24.140 155.740 24.000 C 179.510 23.877 200.337 39.888 206.330 62.890 Z"),
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
        pathData = parseSvgPathData("M 176.000 68.000 C 176.000 74.627 170.627 80.000 164.000 80.000 C 157.373 80.000 152.000 74.627 152.000 68.000 C 152.000 61.373 157.373 56.000 164.000 56.000 C 170.627 56.000 176.000 61.373 176.000 68.000 ZM 240.000 80.000 C 240.002 82.676 238.666 85.175 236.440 86.660 L 216.000 100.280 L 216.000 120.000 C 215.939 177.412 169.412 223.939 112.000 224.000 L 24.000 224.000 C 17.848 224.000 12.242 220.473 9.578 214.928 C 6.914 209.383 7.665 202.802 11.510 198.000 L 11.610 197.880 L 96.000 96.630 L 96.000 76.890 C 96.000 43.470 122.790 16.160 155.710 16.000 L 156.000 16.000 C 182.155 15.992 205.302 32.929 213.210 57.860 L 236.440 73.340 C 238.666 74.825 240.002 77.324 240.000 80.000 ZM 217.580 80.000 L 201.900 69.540 C 200.264 68.452 199.086 66.801 198.590 64.900 C 193.537 45.518 176.030 31.994 156.000 32.000 L 155.780 32.000 C 131.640 32.120 112.000 52.250 112.000 76.890 L 112.000 99.520 C 112.003 101.394 111.348 103.209 110.150 104.650 L 24.000 208.000 L 50.900 208.000 L 121.840 122.880 C 123.650 120.620 126.539 119.513 129.396 119.988 C 132.252 120.462 134.629 122.443 135.611 125.166 C 136.593 127.890 136.027 130.932 134.130 133.120 L 71.750 208.000 L 112.000 208.000 C 160.578 207.945 199.945 168.578 200.000 120.000 L 200.000 96.000 C 199.998 93.324 201.334 90.825 203.560 89.340 Z"),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
