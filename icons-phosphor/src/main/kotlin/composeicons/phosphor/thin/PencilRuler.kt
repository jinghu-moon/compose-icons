package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorThinIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-48c-6.627 0-12 5.373-12 12v160c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4v-36h28c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28v-32h28c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28v-32h28c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28v-36c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM74.83 29.17C74.08 28.419 73.062 27.997 72 27.997c-1.062 0-2.08 .422-2.83 1.173l-32 32C36.42 61.921 35.999 62.939 36 64v144c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-144c.001-1.061-.42-2.079-1.17-2.83ZM44 76h24v104h-24ZM100 208c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4v-20h56ZM100 180h-24v-104h24ZM100 68h-56v-2.34L72 37.66l28 28Z"),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
