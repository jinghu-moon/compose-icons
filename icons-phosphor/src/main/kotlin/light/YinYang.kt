package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorLightIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 38.000 128.000 C 38.055 78.317 78.317 38.055 128.000 38.000 C 151.196 38.000 170.000 56.804 170.000 80.000 C 170.000 103.196 151.196 122.000 128.000 122.000 C 108.079 122.007 89.779 132.982 80.392 150.553 C 71.004 168.124 72.053 189.436 83.120 206.000 C 55.219 189.934 38.016 160.196 38.000 128.000 ZM 128.000 218.000 C 104.804 218.000 86.000 199.196 86.000 176.000 C 86.000 152.804 104.804 134.000 128.000 134.000 C 147.921 133.993 166.221 123.018 175.608 105.447 C 184.996 87.876 183.947 66.564 172.880 50.000 C 208.199 70.331 225.449 111.857 214.931 151.228 C 204.413 190.600 168.752 217.991 128.000 218.000 ZM 138.000 176.000 C 138.000 181.523 133.523 186.000 128.000 186.000 C 122.477 186.000 118.000 181.523 118.000 176.000 C 118.000 170.477 122.477 166.000 128.000 166.000 C 133.523 166.000 138.000 170.477 138.000 176.000 ZM 118.000 80.000 C 118.000 74.477 122.477 70.000 128.000 70.000 C 133.523 70.000 138.000 74.477 138.000 80.000 C 138.000 85.523 133.523 90.000 128.000 90.000 C 122.477 90.000 118.000 85.523 118.000 80.000 Z"),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
