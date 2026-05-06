package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MonitorArrowUp: ImageVector
    get() {
        if (_monitorArrowUp != null) return _monitorArrowUp!!
        _monitorArrowUp = phosphorBoldIcon(
            name = "MonitorArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C32.536 36 20 48.536 20 64v112c0 15.464 12.536 28 28 28h160c15.464 0 28-12.536 28-28v-112C236 48.536 223.464 36 208 36ZM212 176c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM172 228c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12ZM160.49 103.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L140 117v35c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-35l-3.51 3.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l24-24c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529Z"),
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
        return _monitorArrowUp!!
    }

private var _monitorArrowUp: ImageVector? = null
