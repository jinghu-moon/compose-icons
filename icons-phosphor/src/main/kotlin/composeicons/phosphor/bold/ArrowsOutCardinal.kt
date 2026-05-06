package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorBoldIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M87.51 64.49C85.251 62.238 83.981 59.18 83.981 55.99c0-3.19 1.27-6.248 3.529-8.5l32-32c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l32 32c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L140 53v43c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-43L104.49 64.49c-2.251 2.253-5.305 3.519-8.49 3.519-3.185 0-6.239-1.266-8.49-3.519ZM151.51 191.49 140 203v-43c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v43L104.49 191.48c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l32 32c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l32-32c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0ZM240.51 119.49l-32-32c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L203 116h-43c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h43l-11.52 11.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l32-32c2.261-2.25 3.533-5.308 3.534-8.498 .002-3.19-1.266-6.249-3.524-8.502ZM53 140h43c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-43L64.52 104.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-32 32c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l32 32c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17Z"),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
