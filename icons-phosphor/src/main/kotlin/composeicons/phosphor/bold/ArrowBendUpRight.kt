package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorBoldIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 112.49l-48 48c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L195 116h-67c-46.371 .05-83.95 37.629-84 84 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12C20.066 140.381 68.381 92.066 128 92h67L167.51 64.48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l48 48c2.26 2.255 3.528 5.317 3.524 8.509-.004 3.192-1.279 6.251-3.544 8.501Z"),
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
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null
