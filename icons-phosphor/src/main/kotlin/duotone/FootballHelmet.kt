package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorDuotoneIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 112.190 137.740 L 127.810 190.260 C 128.338 192.630 127.762 195.111 126.243 197.005 C 124.724 198.899 122.428 200.000 120.000 200.000 L 72.140 200.000 C 47.009 182.869 31.981 154.414 32.000 124.000 C 32.000 74.000 72.650 32.740 122.690 32.000 C 147.316 31.649 171.055 41.187 188.592 58.479 C 206.130 75.770 216.003 99.371 216.000 124.000 L 216.000 128.000 L 120.000 128.000 C 117.572 128.000 115.276 129.101 113.757 130.995 C 112.238 132.889 111.662 135.370 112.190 137.740 Z"),
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
                pathData = parseSvgPathData("M 96.000 164.000 C 96.000 170.627 90.627 176.000 84.000 176.000 C 77.373 176.000 72.000 170.627 72.000 164.000 C 72.000 157.373 77.373 152.000 84.000 152.000 C 90.627 152.000 96.000 157.373 96.000 164.000 ZM 232.000 176.000 L 232.000 208.000 C 232.000 216.837 224.837 224.000 216.000 224.000 L 180.000 224.000 C 172.917 223.969 166.687 219.313 164.650 212.530 L 153.840 176.000 L 131.910 176.000 L 135.470 188.000 C 135.529 188.177 135.579 188.358 135.620 188.540 C 136.669 193.276 135.513 198.232 132.476 202.015 C 129.440 205.798 124.851 208.000 120.000 208.000 L 72.140 208.000 C 70.527 208.000 68.951 207.512 67.620 206.600 C 40.324 187.967 23.997 157.050 24.000 124.000 C 24.000 69.640 68.240 24.800 122.580 24.000 C 149.347 23.620 175.149 33.988 194.210 52.783 C 213.272 71.577 224.003 97.230 224.000 124.000 L 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 158.710 136.000 L 165.800 160.000 L 216.000 160.000 C 224.837 160.000 232.000 167.163 232.000 176.000 ZM 120.000 120.000 L 207.910 120.000 C 205.757 74.744 168.102 39.350 122.800 40.000 C 77.160 40.640 40.000 78.310 40.000 124.000 C 39.997 150.912 52.888 176.196 74.670 192.000 L 120.000 192.000 L 104.550 140.000 C 104.489 139.823 104.439 139.643 104.400 139.460 C 103.352 134.727 104.506 129.775 107.538 125.992 C 110.569 122.210 115.153 120.006 120.000 120.000 ZM 149.110 160.000 L 142.000 136.000 L 120.000 136.000 L 127.140 160.000 ZM 216.000 176.000 L 170.520 176.000 L 180.000 208.000 L 216.000 208.000 Z"),
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
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
