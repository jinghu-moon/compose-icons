package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorThinIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 20h-88C97.373 20 92 25.373 92 32v78.34L52.08 150.26c-21.445 21.445-21.445 56.215 0 77.66 21.445 21.445 56.215 21.445 77.66 0l68.4-68.41c3.765-3.74 5.875-8.833 5.86-14.14v-113.37c0-6.627-5.373-12-12-12ZM104 28h88c2.209 0 4 1.791 4 4v20h-96v-20c0-2.209 1.791-4 4-4ZM124.08 222.26c-11.831 11.945-29.151 16.645-45.398 12.319C62.436 230.254 49.746 217.564 45.421 201.318c-4.326-16.247 .374-33.566 12.319-45.398L98.83 114.83c.75-.751 1.171-1.769 1.17-2.83v-52h96v48.17c-27.069 2.113-47.968 24.678-48 51.83-.047 10.454 3.092 20.675 9 29.3ZM192.48 153.86l-29.66 29.67C158.339 176.502 155.972 168.335 156 160c.032-22.737 17.36-41.715 40-43.81v29.18c.009 3.187-1.259 6.244-3.52 8.49Z"),
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
        return _sock!!
    }

private var _sock: ImageVector? = null
