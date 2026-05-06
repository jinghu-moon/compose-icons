package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilmReel: ImageVector
    get() {
        if (_filmReel != null) return _filmReel!!
        _filmReel = phosphorBoldIcon(
            name = "FilmReel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 212h-36.2c40.885-33.053 52.008-90.755 26.341-136.638C196.473 29.479 141.481 8.763 91.92 26.307 42.359 43.851 12.647 94.55 21.562 146.363 30.477 198.176 75.426 236.03 128 236h104c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM44 128C44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84 0 46.392-37.608 84-84 84C81.629 211.95 44.05 174.371 44 128ZM108 84c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20ZM128 192c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM152 128c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20ZM104 128c0 11.046-8.954 20-20 20C72.954 148 64 139.046 64 128c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
        return _filmReel!!
    }

private var _filmReel: ImageVector? = null
