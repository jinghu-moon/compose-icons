package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorFillIcon(
            name = "SelectionSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM152 56h32c8.837 0 16 7.163 16 16v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM104 200h-32c-8.837 0-16-7.163-16-16v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM205.66 205.66c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L188.69 200h-36.69c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h20.69L72 83.31v20.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-36.69L50.34 61.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l8 8h0l136 136c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66Z"),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
