package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GlobeX: ImageVector
    get() {
        if (_globeX != null) return _globeX!!
        _globeX = phosphorDuotoneIcon(
            name = "GlobeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 131.389 231.992 134.405 229.850 135.529 226.652 C 136.652 223.455 135.639 219.896 133.000 217.770 L 133.000 217.770 C 131.880 216.860 112.120 200.450 101.940 168.000 L 127.940 168.000 C 132.358 168.000 135.940 164.418 135.940 160.000 C 135.940 155.582 132.358 152.000 127.940 152.000 L 98.080 152.000 C 95.320 136.119 95.320 119.881 98.080 104.000 L 157.960 104.000 C 159.338 111.925 160.021 119.956 160.000 128.000 C 160.000 132.418 163.582 136.000 168.000 136.000 C 172.418 136.000 176.000 132.418 176.000 128.000 C 176.011 119.964 175.396 111.940 174.160 104.000 L 212.670 104.000 C 214.886 111.807 216.007 119.884 216.000 128.000 C 216.000 132.418 219.582 136.000 224.000 136.000 C 228.418 136.000 232.000 132.418 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 107.590 42.400 C 97.346 56.057 89.779 71.529 85.290 88.000 L 49.630 88.000 C 61.373 65.073 82.543 48.417 107.590 42.400 ZM 107.590 213.600 C 82.528 207.594 61.341 190.937 49.590 168.000 L 85.290 168.000 C 89.779 184.471 97.346 199.943 107.590 213.600 ZM 81.840 152.000 L 43.330 152.000 C 38.890 136.308 38.890 119.692 43.330 104.000 L 81.840 104.000 C 79.387 119.906 79.387 136.094 81.840 152.000 ZM 102.000 88.000 C 107.123 71.214 116.016 55.822 128.000 43.000 C 139.979 55.825 148.872 71.216 154.000 88.000 ZM 170.750 88.000 C 166.261 71.529 158.694 56.057 148.450 42.400 C 173.512 48.406 194.699 65.063 206.450 88.000 ZM 221.700 173.660 L 203.310 192.000 L 221.660 210.340 C 224.786 213.466 224.786 218.534 221.660 221.660 C 218.534 224.786 213.466 224.786 210.340 221.660 L 192.000 203.310 L 173.660 221.660 C 170.534 224.786 165.466 224.786 162.340 221.660 C 159.214 218.534 159.214 213.466 162.340 210.340 L 180.690 192.000 L 162.340 173.660 C 159.214 170.534 159.214 165.466 162.340 162.340 C 165.466 159.214 170.534 159.214 173.660 162.340 L 192.000 180.690 L 210.340 162.340 C 213.466 159.214 218.534 159.214 221.660 162.340 C 224.786 165.466 224.786 170.534 221.660 173.660 Z"),
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
        return _globeX!!
    }

private var _globeX: ImageVector? = null
