package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorBoldIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M87.51 72.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L116 67v-43c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v43L151.51 55.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529ZM136.51 151.49c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-32 32c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L116 189v43c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-43l11.51 11.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM232 116h-43l11.52-11.51c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-32 32c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l32 32c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L189 140h43c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM104.49 119.51l-32-32c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L67 116h-43c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h43L55.51 151.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l32-32c2.257-2.254 3.523-5.314 3.519-8.504-.004-3.19-1.277-6.247-3.539-8.496Z"),
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
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
