package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorBoldIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.49 88.49l-48 48c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L187 92h-103v132c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-144C60 73.373 65.373 68 72 68h115L159.51 40.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l48 48c2.257 2.254 3.523 5.314 3.519 8.504-.004 3.19-1.277 6.247-3.539 8.496Z"),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
