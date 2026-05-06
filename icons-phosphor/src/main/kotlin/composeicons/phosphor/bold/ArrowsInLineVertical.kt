package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorBoldIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h176c6.627 0 12 5.373 12 12ZM119.51 96.49c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l32-32c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L140 59v-43C140 9.373 134.627 4 128 4c-6.627 0-12 5.373-12 12v43L104.49 47.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17ZM136.51 159.49c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-32 32c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L116 197v43c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-43l11.51 11.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17Z"),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
