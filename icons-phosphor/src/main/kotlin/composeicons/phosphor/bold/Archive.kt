package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = phosphorBoldIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 44h-192C20.954 44 12 52.954 12 64v24c-.002 9.505 6.687 17.699 16 19.6v84.4c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-84.4C237.313 105.699 244.002 97.505 244 88v-24C244 52.954 235.046 44 224 44ZM36 68h184v16h-184ZM52 188v-80h152v80ZM164 136c0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12Z"),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
