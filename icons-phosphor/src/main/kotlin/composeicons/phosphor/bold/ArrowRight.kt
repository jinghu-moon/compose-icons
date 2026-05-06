package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = phosphorBoldIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.49 136.49l-72 72c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L187 140h-147c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h147L135.51 64.48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l72 72c2.26 2.255 3.528 5.317 3.524 8.509-.004 3.192-1.279 6.251-3.544 8.501Z"),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
