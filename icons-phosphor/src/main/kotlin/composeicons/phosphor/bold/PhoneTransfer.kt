package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneTransfer: ImageVector
    get() {
        if (_phoneTransfer != null) return _phoneTransfer!!
        _phoneTransfer = phosphorBoldIcon(
            name = "PhoneTransfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 72c0-6.627 5.373-12 12-12h43L175.51 48.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l32 32c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-32 32c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L187 84h-43c-6.627 0-12-5.373-12-12ZM227.84 183.58C223.9 213.608 198.285 236.046 168 236 86.39 236 20 169.61 20 88 19.954 57.715 42.392 32.1 72.42 28.16 81.203 27.074 89.656 31.89 93.2 40l21.11 47.13 .07 .18c2.651 6.155 2.031 13.23-1.65 18.83-.257 .402-.541 .786-.85 1.15L92.82 130c7.06 12.84 20.5 26.16 33.49 33.21l22.31-19c.356-.302 .73-.583 1.12-.84 5.626-3.773 12.783-4.428 19-1.74l.18 .08L216 162.8c8.11 3.544 12.926 11.997 11.84 20.78ZM203.53 183.52l-42-18.81-22.42 19.07c-.356 .305-.73 .589-1.12 .85-5.86 3.906-13.343 4.441-19.7 1.41-19.48-9.4-38.89-28.68-48.31-48-3.047-6.318-2.561-13.771 1.28-19.64 .261-.402 .548-.786 .86-1.15L91.3 94.5l-18.82-42C55.82 56.164 43.964 70.942 44 88c.083 68.449 55.551 123.917 124 124 17.07 .05 31.864-11.809 35.53-28.48Z"),
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
        return _phoneTransfer!!
    }

private var _phoneTransfer: ImageVector? = null
