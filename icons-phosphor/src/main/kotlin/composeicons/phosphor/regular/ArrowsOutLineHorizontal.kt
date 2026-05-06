package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorRegularIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 40v176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-176c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM96 120h-60.69L53.66 101.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0l-32 32C8.838 123.841 7.994 125.877 7.994 128c0 2.123 .844 4.159 2.346 5.66l32 32c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L35.31 136h60.69c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM245.66 122.34l-32-32c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L220.69 120h-60.69c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h60.69l-18.35 18.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66Z"),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
