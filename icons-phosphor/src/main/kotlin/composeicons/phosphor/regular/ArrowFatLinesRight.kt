package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowFatLinesRight: ImageVector
    get() {
        if (_arrowFatLinesRight != null) return _arrowFatLinesRight!!
        _arrowFatLinesRight = phosphorRegularIcon(
            name = "ArrowFatLinesRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.66 122.34l-96-96c-2.288-2.291-5.731-2.976-8.722-1.737C129.947 25.842 127.997 28.762 128 32v40h-24c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8h24v40c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l96-96c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM144 204.69v-28.69c0-4.418-3.582-8-8-8h-24v-80h24c4.418 0 8-3.582 8-8v-28.69L220.69 128ZM48 80v96c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM80 80v96c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _arrowFatLinesRight!!
    }

private var _arrowFatLinesRight: ImageVector? = null
