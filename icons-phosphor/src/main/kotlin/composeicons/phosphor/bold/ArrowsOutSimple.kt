package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorBoldIcon(
            name = "ArrowsOutSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 48v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-19l-39.51 39.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L179 60h-19c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12ZM99.51 139.51 60 179v-19c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-19l39.52-39.51c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0Z"),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
