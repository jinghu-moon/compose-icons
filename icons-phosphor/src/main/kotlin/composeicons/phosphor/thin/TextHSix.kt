package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorThinIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 148c-3.309 .001-6.598 .514-9.75 1.52l21.18-35.47c1.013-1.884 .365-4.231-1.471-5.329-1.836-1.097-4.21-.556-5.389 1.229l-32.25 54c-.033 .054-.059 .111-.08 .17-7.182 12.565-5.037 28.386 5.232 38.585 10.269 10.199 26.104 12.236 38.619 4.968 12.515-7.268 18.595-22.031 14.827-36.004C239.15 157.695 226.473 147.99 212 148ZM212 204c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM148 56v120c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56h-96v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-120c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v56h96v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
