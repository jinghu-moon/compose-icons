package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorBoldIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 120c-.001 3.916-1.912 7.585-5.12 9.83l-40 28c-3.666 2.565-8.454 2.878-12.422 .812C106.49 156.576 104.001 152.474 104 148v-56c.001-4.474 2.49-8.576 6.458-10.642 3.968-2.066 8.756-1.753 12.422 .812l40 28c3.208 2.245 5.119 5.914 5.12 9.83ZM236 64v112c0 15.464-12.536 28-28 28h-160C32.536 204 20 191.464 20 176v-112C20 48.536 32.536 36 48 36h160c15.464 0 28 12.536 28 28ZM212 64c0-2.209-1.791-4-4-4h-160c-2.209 0-4 1.791-4 4v112c0 2.209 1.791 4 4 4h160c2.209 0 4-1.791 4-4ZM160 216h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
