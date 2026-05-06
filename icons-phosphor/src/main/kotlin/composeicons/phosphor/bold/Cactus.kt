package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorBoldIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 204h-44v-16c39.746-.044 71.956-32.254 72-72C244 98.327 229.673 84 212 84c-17.673 0-32 14.327-32 32 0 4.418-3.582 8-8 8v-68C172 31.699 152.301 12 128 12 103.699 12 84 31.699 84 56v28c-4.418 0-8-3.582-8-8C76 58.327 61.673 44 44 44 26.327 44 12 58.327 12 76c.044 39.746 32.254 71.956 72 72v56h-44c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM96 124h-12C57.502 123.972 36.028 102.498 36 76c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 17.673 14.327 32 32 32h12c6.627 0 12-5.373 12-12v-40c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v80c0 6.627 5.373 12 12 12h12c17.673 0 32-14.327 32-32 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8-.028 26.498-21.502 47.972-48 48h-12c-6.627 0-12 5.373-12 12v28h-40v-68c0-6.627-5.373-12-12-12Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
