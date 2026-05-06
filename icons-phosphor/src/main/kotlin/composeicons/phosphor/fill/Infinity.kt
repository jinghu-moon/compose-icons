package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorFillIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM204.28 156.28c-15.555 15.556-40.752 15.632-56.4 .17L97.29 111.34 97 111c-9.381-9.349-24.562-9.331-33.921 .039-9.359 9.37-9.359 24.551 0 33.921 9.359 9.37 24.54 9.388 33.921 .039 .36-.36 .71-.73 1-1.1 2.927-3.314 7.986-3.627 11.3-.7 3.314 2.927 3.627 7.986 .7 11.3-.55 .62-1.13 1.23-1.71 1.81-15.598 15.602-40.883 15.63-56.515 .061C36.144 140.803 36.068 115.519 51.606 99.857 67.144 84.196 92.429 84.072 108.12 99.58l50.58 45.11 .33 .31c9.389 9.34 24.57 9.309 33.921-.069 9.351-9.379 9.338-24.559-.03-33.921C183.554 101.647 168.373 101.643 159 111c-.36 .36-.7 .72-1 1.1-2.924 3.314-7.981 3.629-11.295 .705-3.314-2.924-3.629-7.981-.705-11.295 .54-.62 1.12-1.24 1.71-1.82 15.669-15.324 40.751-15.186 56.25 .31 15.499 15.496 15.641 40.579 .32 56.25Z"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
