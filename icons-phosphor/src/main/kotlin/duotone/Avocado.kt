package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorDuotoneIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 203.450 133.330 L 173.630 49.050 C 167.235 29.506 149.101 16.207 128.538 15.981 C 107.976 15.755 89.554 28.651 82.730 48.050 L 53.190 131.590 C 40.658 164.670 51.340 202.054 79.458 223.519 C 107.576 244.984 146.453 245.434 175.060 224.626 C 203.667 203.818 215.212 166.692 203.450 133.330 ZM 128.000 200.000 C 105.909 200.000 88.000 182.091 88.000 160.000 C 88.000 137.909 105.909 120.000 128.000 120.000 C 150.091 120.000 168.000 137.909 168.000 160.000 C 168.000 182.091 150.091 200.000 128.000 200.000 Z"),
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
                pathData = parseSvgPathData("M 128.000 112.000 C 101.490 112.000 80.000 133.490 80.000 160.000 C 80.000 186.510 101.490 208.000 128.000 208.000 C 154.510 208.000 176.000 186.510 176.000 160.000 C 175.972 133.502 154.498 112.028 128.000 112.000 ZM 128.000 192.000 C 110.327 192.000 96.000 177.673 96.000 160.000 C 96.000 142.327 110.327 128.000 128.000 128.000 C 145.673 128.000 160.000 142.327 160.000 160.000 C 160.000 177.673 145.673 192.000 128.000 192.000 ZM 211.000 130.660 L 181.200 46.470 C 173.710 23.708 152.569 8.234 128.608 7.976 C 104.647 7.719 83.177 22.735 75.200 45.330 L 75.200 45.330 L 45.690 128.830 C 31.941 165.223 43.719 206.326 74.657 229.913 C 105.595 253.499 148.350 253.973 179.802 231.077 C 211.255 208.180 223.940 167.348 211.000 130.660 ZM 128.000 232.000 C 104.336 231.984 82.188 220.349 68.748 200.872 C 55.308 181.395 52.288 156.560 60.670 134.430 C 60.689 134.368 60.712 134.308 60.740 134.250 L 90.280 50.660 L 90.280 50.660 C 95.981 34.505 111.335 23.774 128.465 23.973 C 145.595 24.172 160.696 35.257 166.020 51.540 L 166.080 51.720 L 195.900 136.000 C 203.668 158.039 200.264 182.477 186.771 201.555 C 173.277 220.634 151.368 231.983 128.000 232.000 Z"),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
