package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorThinIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.45 174c.538 .917 .688 2.011 .418 3.039-.27 1.028-.939 1.907-1.858 2.441l-96 56c-1.238 .715-2.762 .715-4 0l-96-56c-1.809-1.15-2.39-3.522-1.317-5.377 1.073-1.856 3.418-2.536 5.317-1.543l94 54.83 94-54.83c1.902-1.092 4.328-.45 5.44 1.44ZM222 124.54l-94 54.83L34 124.54c-1.899-.994-4.244-.313-5.317 1.543-1.073 1.856-.492 4.227 1.317 5.377l96 56c1.238 .715 2.762 .715 4 0l96-56c1.809-1.15 2.39-3.522 1.317-5.377-1.073-1.856-3.418-2.536-5.317-1.543ZM28 80c.001-1.428 .764-2.746 2-3.46l96-56c1.238-.715 2.762-.715 4 0l96 56c1.234 .716 1.993 2.034 1.993 3.46 0 1.426-.759 2.744-1.993 3.46l-96 56c-1.238 .715-2.762 .715-4 0L30 83.46C28.764 82.746 28.001 81.428 28 80ZM39.94 80 128 131.37 216.06 80 128 28.63Z"),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
