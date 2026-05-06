package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceTabletCamera: ImageVector
    get() {
        if (_deviceTabletCamera != null) return _deviceTabletCamera!!
        _deviceTabletCamera = phosphorThinIcon(
            name = "DeviceTabletCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 28h-128C52.954 28 44 36.954 44 48v160c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-160C212 36.954 203.046 28 192 28ZM204 208c0 6.627-5.373 12-12 12h-128c-6.627 0-12-5.373-12-12v-160C52 41.373 57.373 36 64 36h128c6.627 0 12 5.373 12 12ZM136 68c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _deviceTabletCamera!!
    }

private var _deviceTabletCamera: ImageVector? = null
