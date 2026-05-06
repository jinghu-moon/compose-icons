package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorThinIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 36h-80C59.295 36.033 36.033 59.295 36 88v80c.033 28.705 23.295 51.967 52 52h48c.429 .001 .855-.07 1.26-.21 25.46-8.48 74.05-57.07 82.53-82.53 .14-.405 .211-.831 .21-1.26v-48C219.967 59.295 196.705 36.033 168 36ZM44 168v-80C44.028 63.711 63.711 44.028 88 44h80c24.289 .028 43.972 19.711 44 44v44h-28c-28.705 .033-51.967 23.295-52 52v28h-44C63.711 211.972 44.028 192.289 44 168ZM140 210v-26c.028-24.289 19.711-43.972 44-44h26c-11.1 22.23-47.77 58.9-70 70Z"),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
