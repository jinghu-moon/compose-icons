package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorFillIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128v56c0 13.255-10.745 24-24 24h-16c-13.255 0-24-10.745-24-24v-40c0-13.255 10.745-24 24-24h23.65c-3.983-45.136-41.689-79.809-87-80h-.65C82.497 39.998 44.497 74.686 40.36 120h23.64c13.255 0 24 10.745 24 24v40c0 13.255-10.745 24-24 24h-16C34.745 208 24 197.255 24 184v-56C24.046 85.87 49.478 47.921 88.428 31.862c38.95-16.058 83.738-7.059 113.462 22.798C221.271 74.136 232.105 100.524 232 128Z"),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
