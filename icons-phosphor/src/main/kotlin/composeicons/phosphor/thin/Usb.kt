package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorThinIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.22 124.67l-48-32c-1.228-.819-2.807-.896-4.108-.199-1.301 .697-2.113 2.053-2.112 3.529v28h-128v-52c0-2.209 1.791-4 4-4h36.29c2.098 14.535 15.07 24.98 29.718 23.928C152.656 90.876 164.003 78.686 164.003 64c0-14.686-11.347-26.876-25.995-27.928C123.36 35.02 110.388 45.465 108.29 60h-36.29C65.373 60 60 65.373 60 72v52h-52c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h52v52c0 6.627 5.373 12 12 12h36v12c0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12v12h-36c-2.209 0-4-1.791-4-4v-52h128v28c-.002 1.476 .809 2.833 2.11 3.53 1.302 .697 2.882 .62 4.11-.2l48-32c1.114-.742 1.784-1.991 1.784-3.33 0-1.339-.67-2.588-1.784-3.33ZM136 44c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C124.954 84 116 75.046 116 64c0-11.046 8.954-20 20-20ZM116 176c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4v32c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4ZM204 152.53v-49.06L240.79 128Z"),
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
