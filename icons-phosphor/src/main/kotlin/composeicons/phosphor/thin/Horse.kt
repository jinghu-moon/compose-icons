package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorThinIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 100c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM228 129.42c-.904 53.841-44.166 97.358-98 98.58h-2.09c-24.524 .171-48.246-8.734-66.6-25-1.657-1.475-1.805-4.013-.33-5.67 1.475-1.657 4.013-1.805 5.67-.33 7.149 6.393 15.284 11.59 24.09 15.39l31.35-43.11c-25.16-13-53.95-8.1-68.14-5.7C43.411 165.419 32.749 161.058 26.52 152.36c-.05-.07-.1-.14-.14-.21l-13.79-22c-.561-.893-.742-1.973-.5-3 .24-1.039 .884-1.938 1.79-2.5L116 61.76v-29.76c0-2.209 1.791-4 4-4h8c26.77-.003 52.423 10.728 71.217 29.79 18.795 19.062 29.163 44.864 28.783 71.63ZM193.52 63.42C176.273 45.816 152.645 35.928 128 36h-4v28c.002 1.39-.717 2.681-1.9 3.41L21.53 129.29l11.58 18.52c4.462 6.148 12.037 9.217 19.52 7.91 15.68-2.66 48.08-8.13 76.39 8.25 23.909-.544 43.006-20.085 43-44 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 .007 27.936-22.037 50.898-49.95 52.03L98.51 215.4c10.117 3.286 20.716 4.841 31.35 4.6 36.758-.734 69.549-23.281 83.393-57.34 13.843-34.059 6.08-73.09-19.743-99.26Z"),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
