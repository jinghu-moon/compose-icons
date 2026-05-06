package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorThinIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 36h-112C56.536 36 44 48.536 44 64v144c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-20h72v20c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-144C212 48.536 199.464 36 184 36ZM52 180v-64h152v64ZM204 108h-152v-32h152ZM84 208c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4v-20h32ZM200 212h-24c-2.209 0-4-1.791-4-4v-20h32v20c0 2.209-1.791 4-4 4ZM204 68h-152v-4C52 52.954 60.954 44 72 44h112c11.046 0 20 8.954 20 20ZM100 148c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM172 148c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM244 80v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM20 80v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
