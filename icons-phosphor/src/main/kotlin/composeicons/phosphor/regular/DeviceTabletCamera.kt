package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DeviceTabletCamera: ImageVector
    get() {
        if (_deviceTabletCamera != null) return _deviceTabletCamera!!
        _deviceTabletCamera = phosphorRegularIcon(
            name = "DeviceTabletCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 24h-128C50.745 24 40 34.745 40 48v160c0 13.255 10.745 24 24 24h128c13.255 0 24-10.745 24-24v-160C216 34.745 205.255 24 192 24ZM200 208c0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8ZM140 68c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
