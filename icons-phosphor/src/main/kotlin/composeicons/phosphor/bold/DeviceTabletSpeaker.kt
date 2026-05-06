package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceTabletSpeaker: ImageVector
    get() {
        if (_deviceTabletSpeaker != null) return _deviceTabletSpeaker!!
        _deviceTabletSpeaker = phosphorBoldIcon(
            name = "DeviceTabletSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 20h-128C48.536 20 36 32.536 36 48v160c0 15.464 12.536 28 28 28h128c15.464 0 28-12.536 28-28v-160C220 32.536 207.464 20 192 20ZM196 208c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4ZM172 72c0 6.627-5.373 12-12 12h-64C89.373 84 84 78.627 84 72 84 65.373 89.373 60 96 60h64c6.627 0 12 5.373 12 12Z"),
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
        return _deviceTabletSpeaker!!
    }

private var _deviceTabletSpeaker: ImageVector? = null
