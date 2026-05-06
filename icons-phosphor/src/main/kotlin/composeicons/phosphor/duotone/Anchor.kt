package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorDuotoneIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 56c0 13.255-10.745 24-24 24C114.745 80 104 69.255 104 56c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M216 136c-4.418 0-8 3.582-8 8 0 24.69-13.77 29.64-38.1 36.28-11.36 3.1-24.12 6.6-33.9 14.34v-66.62h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-32v-25c15.602-4.029 25.775-19.03 23.745-35.016C157.714 35.998 144.114 24.016 128 24.016c-16.114 0-29.715 11.982-31.745 27.968C94.225 67.97 104.398 82.971 120 87v25h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v66.62C110.22 186.88 97.46 183.38 86.1 180.28 61.77 173.64 48 168.69 48 144c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 38.11 27.67 45.66 49.9 51.72C106.23 202.36 120 207.31 120 232c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-24.69 13.77-29.64 38.1-36.28C196.33 189.66 224 182.11 224 144c0-4.418-3.582-8-8-8ZM112 56c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16Z"),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
