package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StackPlus: ImageVector
    get() {
        if (_stackPlus != null) return _stackPlus!!
        _stackPlus = phosphorBoldIcon(
            name = "StackPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 200c0 6.627-5.373 12-12 12h-8v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h8v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v8h8c6.627 0 12 5.373 12 12ZM218 117.63l-90 52.48L38.05 117.63c-5.701-3.061-12.802-1.051-16.052 4.544-3.251 5.595-1.48 12.759 4.002 16.196l96 56c3.738 2.182 8.362 2.182 12.1 0l96-56c5.727-3.341 7.661-10.693 4.32-16.42-3.341-5.727-10.693-7.661-16.42-4.32ZM20 80c.008-4.279 2.294-8.23 6-10.37L122 13.63c3.742-2.17 8.358-2.17 12.1 0l96 56c3.691 2.149 5.962 6.099 5.962 10.37 0 4.271-2.27 8.221-5.962 10.37l-96 56c-3.738 2.182-8.362 2.182-12.1 0L26 90.37C22.294 88.23 20.008 84.279 20 80ZM55.82 80 128 122.11 200.18 80 128 37.89ZM138 212.3l-10 5.81L38.05 165.63c-5.701-3.061-12.802-1.051-16.052 4.544-3.251 5.595-1.48 12.759 4.002 16.196l96 56c3.738 2.182 8.362 2.182 12.1 0l16-9.34c5.724-3.341 7.656-10.691 4.315-16.415-3.341-5.724-10.691-7.656-16.415-4.315Z"),
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
        return _stackPlus!!
    }

private var _stackPlus: ImageVector? = null
