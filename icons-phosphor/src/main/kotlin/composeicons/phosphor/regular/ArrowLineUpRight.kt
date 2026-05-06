package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorRegularIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 216c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8ZM80 176c2.122 .002 4.158-.84 5.66-2.34L184 75.31v76.69c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-96c0-4.418-3.582-8-8-8h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h76.69L74.34 162.34c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938Z"),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
