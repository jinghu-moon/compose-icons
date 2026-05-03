package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorLightIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 26.000 L 72.000 26.000 C 55.431 26.000 42.000 39.431 42.000 56.000 L 42.000 224.000 C 42.000 227.314 44.686 230.000 48.000 230.000 L 192.000 230.000 C 195.314 230.000 198.000 227.314 198.000 224.000 C 198.000 220.686 195.314 218.000 192.000 218.000 L 54.000 218.000 L 54.000 216.000 C 54.000 206.059 62.059 198.000 72.000 198.000 L 208.000 198.000 C 211.314 198.000 214.000 195.314 214.000 192.000 L 214.000 32.000 C 214.000 28.686 211.314 26.000 208.000 26.000 ZM 202.000 186.000 L 72.000 186.000 C 65.507 185.991 59.188 188.097 54.000 192.000 L 54.000 56.000 C 54.000 46.059 62.059 38.000 72.000 38.000 L 202.000 38.000 Z"),
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
        return _book!!
    }

private var _book: ImageVector? = null
