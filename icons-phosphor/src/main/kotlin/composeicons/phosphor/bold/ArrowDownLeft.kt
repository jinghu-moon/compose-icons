package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorBoldIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200.49 72.48 93 180h75c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-104c-6.627 0-12-5.373-12-12v-104C52 81.373 57.373 76 64 76c6.627 0 12 5.373 12 12v75L183.51 55.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
