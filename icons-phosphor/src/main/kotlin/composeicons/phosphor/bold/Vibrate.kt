package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorBoldIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 28h-72C76.536 28 64 40.536 64 56v144c0 15.464 12.536 28 28 28h72c15.464 0 28-12.536 28-28v-144C192 40.536 179.464 28 164 28ZM168 200c0 2.209-1.791 4-4 4h-72c-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4h72c2.209 0 4 1.791 4 4ZM232 100v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM48 100v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56C24 93.373 29.373 88 36 88c6.627 0 12 5.373 12 12Z"),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
