package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorThinIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 233.340 190.090 L 145.880 38.220 C 142.151 31.887 135.349 27.999 128.000 27.999 C 120.651 27.999 113.849 31.887 110.120 38.220 L 22.660 190.090 C 19.099 196.178 19.099 203.712 22.660 209.800 C 26.336 216.184 33.174 220.085 40.540 220.000 L 215.460 220.000 C 222.819 220.078 229.648 216.178 233.320 209.800 C 236.887 203.716 236.894 196.181 233.340 190.090 ZM 226.400 205.800 C 224.139 209.689 219.958 212.058 215.460 212.000 L 40.540 212.000 C 36.042 212.058 31.861 209.689 29.600 205.800 C 27.449 202.189 27.449 197.691 29.600 194.080 L 117.050 42.210 C 119.354 38.359 123.512 36.001 128.000 36.001 C 132.488 36.001 136.646 38.359 138.950 42.210 L 226.400 194.080 C 228.551 197.691 228.551 202.189 226.400 205.800 Z"),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
