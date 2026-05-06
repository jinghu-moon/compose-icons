package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendDoubleUpRight: ImageVector
    get() {
        if (_arrowBendDoubleUpRight != null) return _arrowBendDoubleUpRight!!
        _arrowBendDoubleUpRight = phosphorBoldIcon(
            name = "ArrowBendDoubleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 112.49l-48 48c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L207 104 167.51 64.48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l48 48c2.26 2.255 3.528 5.317 3.524 8.509-.004 3.192-1.279 6.251-3.544 8.501ZM176.49 95.49l-48-48c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L139 92h-11C68.381 92.066 20.066 140.381 20 200c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 .05-46.371 37.629-83.95 84-84h11l-27.52 27.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l48-48c2.261-2.25 3.533-5.308 3.534-8.498 .002-3.19-1.266-6.249-3.524-8.502Z"),
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
        return _arrowBendDoubleUpRight!!
    }

private var _arrowBendDoubleUpRight: ImageVector? = null
