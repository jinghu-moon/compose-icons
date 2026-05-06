package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorBoldIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 160c0 6.627-5.373 12-12 12h-111.78L56.88 224.07c-4.478 4.81-11.991 5.124-16.854 .704-4.863-4.42-5.267-11.928-.906-16.844L71.78 172h-31.78c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h53.6L130 108h-90C33.373 108 28 102.627 28 96 28 89.373 33.373 84 40 84h111.78L199.12 31.93c4.478-4.81 11.991-5.124 16.854-.704 4.863 4.42 5.267 11.928 .906 16.844L184.22 84h31.78c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-53.6L126 148h90c6.627 0 12 5.373 12 12Z"),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
