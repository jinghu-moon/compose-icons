package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpinnerGap: ImageVector
    get() {
        if (_spinnerGap != null) return _spinnerGap!!
        _spinnerGap = phosphorFillIcon(
            name = "SpinnerGap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM48 136c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM94.06 173.25l-17 17c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l17-17c3.145-2.988 8.099-2.925 11.167 .143 3.068 3.068 3.131 8.022 .143 11.167ZM94.06 94.06c-3.124 3.122-8.186 3.122-11.31 0l-17-17c-3.118-3.131-3.106-8.197 .025-11.315 3.131-3.118 8.197-3.106 11.315 .025l17 17c3.1 3.13 3.087 8.177-.03 11.29ZM136 208c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM136 72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM190.23 190.23c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-17-17c-2.988-3.145-2.925-8.099 .143-11.167 3.068-3.068 8.022-3.131 11.167-.143l17 17c3.124 3.121 3.129 8.183 .01 11.31ZM208 136h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _spinnerGap!!
    }

private var _spinnerGap: ImageVector? = null
