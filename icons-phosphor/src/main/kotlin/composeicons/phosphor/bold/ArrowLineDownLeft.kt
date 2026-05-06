package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorBoldIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 48c0 6.627-5.373 12-12 12h-176C41.373 60 36 54.627 36 48 36 41.373 41.373 36 48 36h176c6.627 0 12 5.373 12 12ZM175.51 87.51 84 179v-67c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v96c0 6.627 5.373 12 12 12h96c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-67l91.52-91.51c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0Z"),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
