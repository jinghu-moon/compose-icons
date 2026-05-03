package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorFillIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 160.000 L 165.800 160.000 L 158.710 136.000 L 216.000 136.000 C 220.418 136.000 224.000 132.418 224.000 128.000 L 224.000 124.000 C 224.003 97.230 213.272 71.577 194.210 52.783 C 175.149 33.988 149.347 23.620 122.580 24.000 C 68.240 24.770 24.000 69.610 24.000 124.000 C 23.997 157.050 40.324 187.967 67.620 206.600 C 68.951 207.512 70.527 208.000 72.140 208.000 L 120.000 208.000 C 124.853 208.000 129.444 205.798 132.481 202.012 C 135.518 198.227 136.673 193.268 135.620 188.530 C 135.579 188.348 135.529 188.167 135.470 187.990 L 131.910 175.990 L 153.840 175.990 L 164.630 212.520 C 166.665 219.314 172.907 223.977 180.000 224.000 L 216.000 224.000 C 224.837 224.000 232.000 216.837 232.000 208.000 L 232.000 176.000 C 232.000 167.163 224.837 160.000 216.000 160.000 ZM 84.000 176.000 C 77.373 176.000 72.000 170.627 72.000 164.000 C 72.000 157.373 77.373 152.000 84.000 152.000 C 90.627 152.000 96.000 157.373 96.000 164.000 C 96.000 170.627 90.627 176.000 84.000 176.000 ZM 127.160 160.000 L 120.000 136.000 L 142.000 136.000 L 149.090 160.000 ZM 216.000 208.000 L 180.000 208.000 L 170.540 176.000 L 216.000 176.000 Z"),
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
