package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorBoldIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 100h-83.08L211.06 79.37c3.092-.816 5.731-2.832 7.331-5.601 1.6-2.769 2.028-6.063 1.189-9.149L211.42 34.62C208.502 24.104 197.673 17.886 187.12 20.67L34.79 60.87c-5.127 1.336-9.501 4.676-12.14 9.27-2.644 4.533-3.347 9.941-1.95 15L28 112v88c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-88c0-6.627-5.373-12-12-12ZM124.89 61.91l18.29 10.56-25.95 6.85L98.94 68.76ZM189.34 44.91l3.91 14.35-17.13 4.52L157.83 53.21ZM66 77.46 84.29 88 48.89 97.35 45 83ZM204 196h-152v-72h152Z"),
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
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
