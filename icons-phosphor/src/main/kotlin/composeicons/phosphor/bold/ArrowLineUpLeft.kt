package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorBoldIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 208c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h176c6.627 0 12 5.373 12 12ZM72 156c6.627 0 12-5.373 12-12v-67l91.51 91.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L101 60h67c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-96C65.373 36 60 41.373 60 48v96c0 6.627 5.373 12 12 12Z"),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
