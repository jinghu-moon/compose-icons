package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorBoldIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M47.51 112.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L116 147v-115c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v115L191.51 95.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-72 72c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529ZM216 204h-176c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
