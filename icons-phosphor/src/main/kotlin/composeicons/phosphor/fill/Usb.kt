package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorFillIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 128c.001 1.338-.667 2.588-1.78 3.33l-48 32c-1.228 .819-2.807 .896-4.108 .199-1.301-.697-2.113-2.053-2.112-3.529v-24h-124v48h36v-8c0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12v32c0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12v-8h-36c-8.837 0-16-7.163-16-16v-48h-48C3.582 136 0 132.418 0 128c0-4.418 3.582-8 8-8h48v-48C56 63.163 63.163 56 72 56h37.17c3.972-13.323 17.118-21.714 30.875-19.707 13.757 2.007 23.958 13.804 23.958 27.707 0 13.903-10.201 25.7-23.958 27.707C126.288 93.714 113.142 85.323 109.17 72h-37.17v48h124v-24c-.001-1.476 .811-2.832 2.112-3.529 1.301-.697 2.88-.62 4.108 .199l48 32c1.113 .742 1.781 1.992 1.78 3.33Z"),
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
        return _usb!!
    }

private var _usb: ImageVector? = null
