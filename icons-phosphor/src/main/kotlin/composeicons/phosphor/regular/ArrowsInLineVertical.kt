package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorRegularIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8ZM122.34 101.66c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L136 76.69v-60.69c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v60.69L101.66 58.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32ZM133.66 154.34c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346l-32 32c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L120 179.31v60.69c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-60.69l18.34 18.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32Z"),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
