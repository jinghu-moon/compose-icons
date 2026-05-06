package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinkSimpleHorizontalBreak: ImageVector
    get() {
        if (_linkSimpleHorizontalBreak != null) return _linkSimpleHorizontalBreak!!
        _linkSimpleHorizontalBreak = phosphorRegularIcon(
            name = "LinkSimpleHorizontalBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 128c0 22.091 17.909 40 40 40h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40C33.072 184 8 158.928 8 128 8 97.072 33.072 72 64 72h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40C41.909 88 24 105.909 24 128ZM192 72h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c30.928 0 56-25.072 56-56C248 97.072 222.928 72 192 72Z"),
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
