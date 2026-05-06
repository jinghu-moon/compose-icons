package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorBoldIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 200.49l-32 32c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L195 204h-115c-6.627 0-12-5.373-12-12v-123L56.49 80.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L71.49 31.49c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l32 32c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L92 69v111h103L183.48 168.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l32 32c2.261 2.25 3.533 5.308 3.534 8.498 .002 3.19-1.266 6.249-3.524 8.502Z"),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
