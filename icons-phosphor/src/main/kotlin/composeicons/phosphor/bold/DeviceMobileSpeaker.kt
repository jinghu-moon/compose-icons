package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceMobileSpeaker: ImageVector
    get() {
        if (_deviceMobileSpeaker != null) return _deviceMobileSpeaker!!
        _deviceMobileSpeaker = phosphorBoldIcon(
            name = "DeviceMobileSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 12h-96C64.536 12 52 24.536 52 40v176c0 15.464 12.536 28 28 28h96c15.464 0 28-12.536 28-28v-176C204 24.536 191.464 12 176 12ZM180 216c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4ZM164 64c0 6.627-5.373 12-12 12h-48C97.373 76 92 70.627 92 64c0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12Z"),
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
        return _deviceMobileSpeaker!!
    }

private var _deviceMobileSpeaker: ImageVector? = null
