package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorDuotoneIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 215.460 216.000 L 40.540 216.000 C 27.920 216.000 20.000 202.790 26.130 192.090 L 113.590 40.220 C 119.890 29.220 136.110 29.220 142.410 40.220 L 229.870 192.090 C 236.000 202.790 228.080 216.000 215.460 216.000 Z"),
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
                pathData = parseSvgPathData("M 236.800 188.090 L 149.350 36.220 C 144.903 28.649 136.780 23.999 128.000 23.999 C 119.220 23.999 111.097 28.649 106.650 36.220 L 19.200 188.090 C 14.919 195.417 14.919 204.483 19.200 211.810 C 23.591 219.433 31.753 224.093 40.550 224.000 L 215.450 224.000 C 224.240 224.086 232.393 219.427 236.780 211.810 C 241.067 204.486 241.075 195.421 236.800 188.090 ZM 222.930 203.800 C 221.378 206.448 218.519 208.053 215.450 208.000 L 40.550 208.000 C 37.481 208.053 34.622 206.448 33.070 203.800 C 31.664 201.419 31.664 198.461 33.070 196.080 L 120.520 44.210 C 122.102 41.577 124.949 39.967 128.020 39.967 C 131.091 39.967 133.938 41.577 135.520 44.210 L 222.970 196.080 C 224.364 198.468 224.349 201.426 222.930 203.800 Z"),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
