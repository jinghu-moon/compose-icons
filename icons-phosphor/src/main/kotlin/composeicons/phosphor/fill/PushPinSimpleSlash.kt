package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorFillIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M79.25 38.69c-1.07-1.177-1.34-2.876-.69-4.327 .651-1.451 2.099-2.379 3.69-2.363h109.75c2.217-.005 4.336 .91 5.853 2.527 1.516 1.617 2.294 3.791 2.147 6.003-.367 4.275-3.979 7.538-8.27 7.47h-6.19l21.16 119.91c.313 1.755-.574 3.506-2.174 4.292-1.6 .786-3.528 .418-4.726-.902ZM213.92 210.62 53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L66.24 72 49.29 168h-9.29c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80v56c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-56h32.1l34 37.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858Z"),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
