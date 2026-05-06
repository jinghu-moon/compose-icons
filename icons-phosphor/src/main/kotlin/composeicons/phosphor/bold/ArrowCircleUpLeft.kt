package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) return _arrowCircleUpLeft!!
        _arrowCircleUpLeft = phosphorBoldIcon(
            name = "ArrowCircleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM168.49 151.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L108 125v19c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-48C84 89.373 89.373 84 96 84h48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-19Z"),
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
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
