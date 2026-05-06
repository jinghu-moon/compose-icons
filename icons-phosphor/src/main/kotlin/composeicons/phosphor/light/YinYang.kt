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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM38 128C38.055 78.317 78.317 38.055 128 38c23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42-19.921 .007-38.221 10.982-47.608 28.553-9.388 17.571-8.339 38.883 2.728 55.447C55.219 189.934 38.016 160.196 38 128ZM128 218C104.804 218 86 199.196 86 176c0-23.196 18.804-42 42-42 19.921-.007 38.221-10.982 47.608-28.553C184.996 87.876 183.947 66.564 172.88 50c35.319 20.331 52.569 61.857 42.051 101.228C204.413 190.6 168.752 217.991 128 218ZM138 176c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM118 80c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10Z"),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
