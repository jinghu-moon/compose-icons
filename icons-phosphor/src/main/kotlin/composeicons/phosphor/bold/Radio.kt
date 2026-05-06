package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorBoldIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 172c19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM160 124c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM216 60h-102.24L195.45 35.5c6.351-1.905 9.955-8.599 8.05-14.95-1.905-6.351-8.599-9.955-14.95-8.05l-160 48C23.473 62.024 19.997 66.699 20 72v120c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-112C236 68.954 227.046 60 216 60ZM212 188h-168v-104h168ZM60 116c0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-24c-6.627 0-12-5.373-12-12ZM60 156c0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-24c-6.627 0-12-5.373-12-12Z"),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
