package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorRegularIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90.34 61.66C88.838 60.159 87.994 58.123 87.994 56c0-2.123 .844-4.159 2.346-5.66l32-32c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l32 32c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L136 43.31v52.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-52.69L101.66 61.66c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346ZM154.34 194.34 136 212.69v-52.69c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v52.69L101.66 194.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l32 32c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0ZM237.66 122.34l-32-32c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L212.69 120h-52.69c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h52.69l-18.35 18.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM43.31 136h52.69c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-52.69L61.66 101.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0l-32 32c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l32 32c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32Z"),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
