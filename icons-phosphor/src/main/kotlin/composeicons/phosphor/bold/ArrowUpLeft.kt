package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorBoldIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200.49 200.49c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L76 93v75c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-104C52 57.373 57.373 52 64 52h104c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-75L200.49 183.51c2.253 2.251 3.519 5.305 3.519 8.49 0 3.185-1.266 6.239-3.519 8.49Z"),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
