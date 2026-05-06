package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorBoldIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 204h-75l86.84-86.84c5.252-5.251 8.202-12.373 8.202-19.8 0-7.427-2.95-14.549-8.202-19.8L186.43 36.19c-5.251-5.252-12.373-8.202-19.8-8.202-7.427 0-14.549 2.95-19.8 8.202L28.19 154.82c-5.252 5.251-8.202 12.373-8.202 19.8 0 7.427 2.95 14.549 8.202 19.8l30.06 30.07c2.252 2.25 5.306 3.512 8.49 3.51h149.26c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM163.8 53.16c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l41.38 41.38c1.558 1.561 1.558 4.089 0 5.65L160 151 113 104ZM71.71 204 45.16 177.45c-1.558-1.561-1.558-4.089 0-5.65L96 121l47 47-36 36Z"),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
