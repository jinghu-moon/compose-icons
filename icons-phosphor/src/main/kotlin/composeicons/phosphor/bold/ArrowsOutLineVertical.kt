package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorBoldIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h176c6.627 0 12 5.373 12 12ZM104.49 56.48 116 45v43c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-43l11.51 11.51c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17l-32-32C134.258 5.251 131.2 3.981 128.01 3.981c-3.19 0-6.248 1.27-8.5 3.529l-32 32c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0ZM151.49 199.48 140 211v-43c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v43L104.49 199.48c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l32 32c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l32-32c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0Z"),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
