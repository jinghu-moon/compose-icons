package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorLightIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 245.370 213.320 L 189.370 101.320 C 188.355 99.284 186.275 97.996 184.000 97.996 C 181.725 97.996 179.645 99.284 178.630 101.320 L 156.330 145.920 C 137.692 145.147 119.756 138.602 105.000 127.190 C 122.154 109.647 132.389 86.494 133.820 62.000 L 160.000 62.000 C 163.314 62.000 166.000 59.314 166.000 56.000 C 166.000 52.686 163.314 50.000 160.000 50.000 L 102.000 50.000 L 102.000 32.000 C 102.000 28.686 99.314 26.000 96.000 26.000 C 92.686 26.000 90.000 28.686 90.000 32.000 L 90.000 50.000 L 32.000 50.000 C 28.686 50.000 26.000 52.686 26.000 56.000 C 26.000 59.314 28.686 62.000 32.000 62.000 L 121.790 62.000 C 120.366 83.560 111.208 103.882 96.000 119.230 C 86.672 109.829 79.538 98.481 75.110 86.000 C 74.434 83.930 72.688 82.388 70.550 81.973 C 68.412 81.558 66.216 82.335 64.815 84.002 C 63.413 85.669 63.024 87.965 63.800 90.000 C 68.736 103.940 76.653 116.635 87.000 127.200 C 71.267 139.407 51.914 146.022 32.000 146.000 C 28.686 146.000 26.000 148.686 26.000 152.000 C 26.000 155.314 28.686 158.000 32.000 158.000 C 55.298 158.021 77.894 150.031 96.000 135.370 C 111.606 147.953 130.571 155.663 150.530 157.540 L 122.640 213.320 C 121.160 216.286 122.364 219.890 125.330 221.370 C 128.296 222.850 131.900 221.646 133.380 218.680 L 147.710 190.000 L 220.290 190.000 L 234.630 218.680 C 235.646 220.715 237.725 222.001 240.000 222.000 C 240.931 222.002 241.850 221.783 242.680 221.360 C 245.641 219.881 246.844 216.283 245.370 213.320 ZM 153.710 178.000 L 184.000 117.420 L 214.290 178.000 Z"),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
