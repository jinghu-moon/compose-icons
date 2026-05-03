package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorFillIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 97.070 155.740 C 95.768 158.329 93.169 160.012 90.274 160.139 C 87.379 160.266 84.642 158.818 83.118 156.353 C 81.594 153.889 81.522 150.793 82.930 148.260 C 89.730 135.609 89.730 120.391 82.930 107.740 C 80.974 103.850 82.488 99.111 86.337 97.075 C 90.185 95.039 94.955 96.455 97.070 100.260 C 106.249 117.614 106.249 138.386 97.070 155.740 ZM 125.070 171.740 C 123.755 174.314 121.154 175.979 118.265 176.095 C 115.377 176.210 112.650 174.758 111.134 172.297 C 109.618 169.836 109.548 166.748 110.950 164.220 C 123.019 141.567 123.019 114.393 110.950 91.740 C 109.548 89.212 109.618 86.124 111.134 83.663 C 112.650 81.202 115.377 79.750 118.265 79.865 C 121.154 79.981 123.755 81.646 125.070 84.220 C 139.659 111.577 139.655 144.406 125.060 171.760 ZM 153.070 187.740 C 150.819 191.250 146.248 192.442 142.569 190.479 C 138.890 188.515 137.337 184.054 139.000 180.230 C 156.476 147.603 156.476 108.397 139.000 75.770 C 136.918 71.871 138.391 67.022 142.290 64.940 C 146.189 62.858 151.038 64.331 153.120 68.230 C 173.089 105.579 173.070 150.437 153.070 187.770 Z"),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
