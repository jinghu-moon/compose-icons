package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Dog: ImageVector
    get() {
        if (_dog != null) return _dog!!
        _dog = phosphorThinIcon(
            name = "Dog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 140c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM164 148c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM228.94 138.89c-1.569 .722-3.273 1.1-5 1.11-3.664-.009-7.117-1.715-9.35-4.62L212 132.09v51.91c0 19.882-16.118 36-36 36h-96C60.118 220 44 203.882 44 184v-51.91l-2.53 3.27c-2.238 2.912-5.697 4.625-9.37 4.64-1.727-.008-3.432-.387-5-1.11-5.082-2.231-7.928-7.697-6.84-13.14l16.42-88c.61-3.249 2.532-6.103 5.315-7.888 2.782-1.785 6.178-2.343 9.385-1.542h.16L104.58 44h46.84L204.5 28.4h.16c3.207-.8 6.603-.242 9.385 1.542 2.782 1.785 4.705 4.639 5.315 7.888l16.42 88c1.051 5.417-1.789 10.839-6.84 13.06ZM97.25 50.18 49.34 36.1c-.302-.067-.611-.101-.92-.1-1.92 .005-3.565 1.373-3.92 3.26L28.08 127.26c-.35 1.815 .589 3.634 2.272 4.399 1.683 .765 3.671 .278 4.808-1.179ZM204 121.75 150 52h-44L52 121.75v62.25c0 15.464 12.536 28 28 28h44v-18.34L109.17 178.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L128 186.34l13.17-13.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L132 193.66v18.34h44c15.464 0 28-12.536 28-28ZM227.92 127.23 211.5 39.23c-.201-1.073-.831-2.017-1.745-2.614-.914-.597-2.032-.794-3.095-.546L158.75 50.18l62.11 80.28c1.145 1.437 3.122 1.91 4.793 1.145 1.671-.764 2.606-2.569 2.267-4.375Z"),
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
        return _dog!!
    }

private var _dog: ImageVector? = null
