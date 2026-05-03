package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorDuotoneIcon(
            name = "GlobeSimpleX",
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
                pathData = parseSvgPathData("M 221.660 173.660 L 203.310 192.000 L 221.660 210.340 C 224.786 213.466 224.786 218.534 221.660 221.660 C 218.534 224.786 213.466 224.786 210.340 221.660 L 192.000 203.310 L 173.660 221.660 C 170.534 224.786 165.466 224.786 162.340 221.660 C 159.214 218.534 159.214 213.466 162.340 210.340 L 180.690 192.000 L 162.340 173.660 C 159.214 170.534 159.214 165.466 162.340 162.340 C 165.466 159.214 170.534 159.214 173.660 162.340 L 192.000 180.690 L 210.340 162.340 C 213.466 159.214 218.534 159.214 221.660 162.340 C 224.786 165.466 224.786 170.534 221.660 173.660 ZM 232.000 128.000 C 232.000 132.418 228.418 136.000 224.000 136.000 L 96.250 136.000 C 99.250 189.730 131.580 216.600 133.020 217.770 L 133.020 217.770 C 135.662 219.898 136.674 223.462 135.546 226.661 C 134.417 229.861 131.393 232.001 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.438 24.000 232.000 70.562 232.000 128.000 ZM 148.410 42.400 C 159.940 57.670 174.000 83.490 175.790 120.000 L 215.630 120.000 C 212.141 82.413 185.115 51.214 148.410 42.400 ZM 128.000 43.000 C 118.460 52.920 98.540 78.420 96.230 120.000 L 159.770 120.000 C 157.460 78.400 137.550 52.900 128.000 43.000 ZM 40.370 120.000 L 80.210 120.000 C 82.000 83.490 96.060 57.670 107.590 42.400 C 70.885 51.214 43.859 82.413 40.370 120.000 ZM 80.210 136.000 L 40.370 136.000 C 43.859 173.587 70.885 204.786 107.590 213.600 C 96.060 198.330 82.000 172.510 80.210 136.000 Z"),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
