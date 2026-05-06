package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowFatRight: ImageVector
    get() {
        if (_arrowFatRight != null) return _arrowFatRight!!
        _arrowFatRight = phosphorRegularIcon(
            name = "ArrowFatRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.66 122.34l-96-96c-2.288-2.291-5.731-2.976-8.722-1.737C129.947 25.842 127.997 28.762 128 32v40h-80C39.163 72 32 79.163 32 88v80c0 8.837 7.163 16 16 16h80v40c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l96-96c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM144 204.69v-28.69c0-4.418-3.582-8-8-8h-88v-80h88c4.418 0 8-3.582 8-8v-28.69L220.69 128Z"),
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
        return _arrowFatRight!!
    }

private var _arrowFatRight: ImageVector? = null
