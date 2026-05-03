package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorThinIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 132.000 100.130 L 132.000 55.070 L 165.940 75.430 C 167.834 76.568 170.292 75.954 171.430 74.060 C 172.568 72.166 171.954 69.708 170.060 68.570 L 135.770 48.000 L 170.060 27.430 C 171.954 26.292 172.568 23.834 171.430 21.940 C 170.292 20.046 167.834 19.432 165.940 20.570 L 128.000 43.340 L 90.060 20.570 C 88.166 19.432 85.708 20.046 84.570 21.940 C 83.432 23.834 84.046 26.292 85.940 27.430 L 120.230 48.000 L 85.940 68.570 C 84.046 69.708 83.432 72.166 84.570 74.060 C 85.708 75.954 88.166 76.568 90.060 75.430 L 124.000 55.070 L 124.000 100.130 C 87.287 102.293 58.947 133.253 60.029 170.013 C 61.112 206.773 91.224 236.012 128.000 236.012 C 164.776 236.012 194.888 206.773 195.971 170.013 C 197.053 133.253 168.713 102.293 132.000 100.130 ZM 128.000 228.000 C 94.863 228.000 68.000 201.137 68.000 168.000 C 68.000 134.863 94.863 108.000 128.000 108.000 C 161.137 108.000 188.000 134.863 188.000 168.000 C 187.961 201.121 161.121 227.961 128.000 228.000 Z"),
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
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
