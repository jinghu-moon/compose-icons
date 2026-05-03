package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorDuotoneIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 97.070 100.260 C 106.249 117.614 106.249 138.386 97.070 155.740 C 95.768 158.329 93.169 160.012 90.274 160.139 C 87.379 160.266 84.642 158.818 83.118 156.353 C 81.594 153.889 81.522 150.793 82.930 148.260 C 89.730 135.609 89.730 120.391 82.930 107.740 C 80.974 103.850 82.488 99.111 86.337 97.075 C 90.185 95.039 94.955 96.455 97.070 100.260 ZM 153.070 68.260 C 173.054 105.601 173.054 150.459 153.070 187.800 C 150.858 191.432 146.192 192.699 142.447 190.684 C 138.702 188.669 137.188 184.077 139.000 180.230 C 156.476 147.603 156.476 108.397 139.000 75.770 C 136.918 71.871 138.391 67.022 142.290 64.940 C 146.189 62.858 151.038 64.331 153.120 68.230 ZM 125.070 84.260 C 139.655 111.610 139.655 144.430 125.070 171.780 C 123.755 174.354 121.154 176.019 118.265 176.135 C 115.377 176.250 112.650 174.798 111.134 172.337 C 109.618 169.876 109.548 166.788 110.950 164.260 C 123.032 141.610 123.032 114.430 110.950 91.780 C 109.548 89.252 109.618 86.164 111.134 83.703 C 112.650 81.242 115.377 79.790 118.265 79.905 C 121.154 80.021 123.755 81.686 125.070 84.260 Z"),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
