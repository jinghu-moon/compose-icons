package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorFillIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 72v144c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8v-144c0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8ZM216 32h-144c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h136v136c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-144c0-4.418-3.582-8-8-8Z"),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
