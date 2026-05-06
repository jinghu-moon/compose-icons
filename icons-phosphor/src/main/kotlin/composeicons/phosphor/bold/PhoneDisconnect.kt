package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorBoldIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.39 87.29C176.72 29.57 79.28 29.57 21.61 87.29c-21.45 21.47-23.52 53.13-5 77 5.41 6.93 14.71 9.515 22.92 6.37L88.4 153.29l.45-.16c6.266-2.522 10.835-8.035 12.15-14.66l5.44-27.24c13.92-4.329 28.822-4.361 42.76-.09L155 138.62c1.365 6.558 5.922 11.998 12.14 14.49l.45 .17 48.94 17.37c8.207 3.14 17.502 .556 22.91-6.37 18.47-23.86 16.4-55.52-5.05-76.99ZM222.16 147.19 178 131.5 172.24 104c-1.435-6.873-6.369-12.491-13-14.8-20.406-6.99-42.565-6.94-62.94 .14-6.619 2.356-11.515 8.012-12.9 14.9L78 131.53 33.84 147.19c-9.16-13.85-7.41-30.77 4.73-42.92C62.81 80 95.41 67.88 128 67.88c32.59 0 65.19 12.12 89.43 36.39 12.14 12.15 13.89 29.08 4.73 42.92ZM228 200c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h176c6.627 0 12 5.373 12 12Z"),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
