package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorDuotoneIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 40.000 L 200.000 200.000 C 200.000 204.418 196.418 208.000 192.000 208.000 L 32.000 208.000 C 28.762 208.003 25.842 206.053 24.603 203.062 C 23.364 200.071 24.049 196.628 26.340 194.340 L 186.340 34.340 C 188.628 32.049 192.071 31.364 195.062 32.603 C 198.053 33.842 200.003 36.762 200.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 213.920 210.620 L 53.920 34.620 C 50.949 31.348 45.887 31.104 42.615 34.075 C 39.343 37.046 39.099 42.108 42.070 45.380 L 100.140 109.240 L 20.690 188.680 C 16.110 193.255 14.738 200.139 17.214 206.120 C 19.690 212.101 25.527 216.001 32.000 216.000 L 192.000 216.000 C 193.545 215.993 195.080 215.764 196.560 215.320 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 32.000 200.000 L 110.900 121.110 L 182.640 200.000 ZM 128.180 92.510 C 125.058 89.386 125.058 84.324 128.180 81.200 L 180.690 28.700 C 185.265 24.128 192.141 22.760 198.117 25.233 C 204.093 27.706 207.993 33.533 208.000 40.000 L 208.000 159.630 C 208.000 164.048 204.418 167.630 200.000 167.630 C 195.582 167.630 192.000 164.048 192.000 159.630 L 192.000 40.000 L 139.500 92.510 C 137.999 94.012 135.963 94.856 133.840 94.856 C 131.717 94.856 129.681 94.012 128.180 92.510 Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
