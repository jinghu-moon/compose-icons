package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkSimpleHorizontalBreak: ImageVector
    get() {
        if (_linkSimpleHorizontalBreak != null) return _linkSimpleHorizontalBreak!!
        _linkSimpleHorizontalBreak = phosphorThinIcon(
            name = "LinkSimpleHorizontalBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 128c.028 24.289 19.711 43.972 44 44h40c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-40C35.281 180 12 156.719 12 128 12 99.281 35.281 76 64 76h40c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-40c-24.289 .028-43.972 19.711-44 44ZM192 76h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c28.719 0 52-23.281 52-52C244 99.281 220.719 76 192 76Z"),
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
        return _linkSimpleHorizontalBreak!!
    }

private var _linkSimpleHorizontalBreak: ImageVector? = null
