package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneList: ImageVector
    get() {
        if (_phoneList != null) return _phoneList!!
        _phoneList = phosphorBoldIcon(
            name = "PhoneList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 162.8 168.91 141.7l-.18-.08c-6.216-2.694-13.376-2.038-19 1.74-.388 .26-.762 .54-1.12 .84l-22.31 19c-13-7.05-26.43-20.37-33.49-33.21l19.06-22.66c.309-.364 .593-.748 .85-1.15 3.672-5.603 4.295-12.671 1.66-18.83-.031-.058-.058-.118-.08-.18L93.2 40C89.646 31.898 81.202 27.083 72.42 28.15 42.391 32.095 19.953 57.713 20 88c0 81.61 66.39 148 148 148 30.287 .047 55.905-22.391 59.85-52.42 1.064-8.782-3.75-17.224-11.85-20.78ZM168 212C99.551 211.917 44.083 156.449 44 88 43.95 70.93 55.809 56.136 72.48 52.47l18.82 42L72.14 117.27c-.312 .364-.599 .748-.86 1.15-3.849 5.874-4.335 13.336-1.28 19.66 9.42 19.28 28.83 38.56 48.31 48 6.361 3.016 13.839 2.465 19.69-1.45 .387-.261 .757-.545 1.11-.85l22.43-19.07 42 18.81C199.866 200.191 185.071 212.047 168 212ZM132 64c0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12ZM132 104c0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12Z"),
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
        return _phoneList!!
    }

private var _phoneList: ImageVector? = null
