package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorLightIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 82.000 L 8.000 82.000 C 4.686 82.000 2.000 84.686 2.000 88.000 C 2.000 157.588 58.412 214.000 128.000 214.000 C 197.588 214.000 254.000 157.588 254.000 88.000 C 254.000 84.686 251.314 82.000 248.000 82.000 ZM 74.460 150.000 L 122.000 102.480 L 122.000 169.760 C 104.437 168.472 87.762 161.540 74.460 150.000 ZM 66.000 141.540 C 54.460 128.238 47.528 111.563 46.240 94.000 L 113.520 94.000 ZM 134.000 102.480 L 181.540 150.000 C 168.238 161.540 151.563 168.472 134.000 169.760 ZM 190.000 141.540 L 142.480 94.000 L 209.760 94.000 C 208.472 111.563 201.540 128.238 190.000 141.540 ZM 128.000 202.000 C 67.400 201.928 17.420 154.512 14.160 94.000 L 34.160 94.000 C 37.390 143.430 78.424 181.871 127.960 181.871 C 177.496 181.871 218.530 143.430 221.760 94.000 L 241.760 94.000 C 238.502 154.481 188.569 201.886 128.000 202.000 Z"),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
