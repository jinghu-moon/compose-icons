package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorThinIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 64c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4ZM168 194.86l3.92 27.44c.494 3.451-.538 6.947-2.826 9.577-2.288 2.63-5.608 4.135-9.094 4.123h-64c-3.479 0-6.788-1.51-9.067-4.138-2.279-2.629-3.306-6.117-2.813-9.562L88 194.86C56.22 179.487 36.022 147.303 36 112c0-2.209 1.791-4 4-4h20v-68C60 33.373 65.373 28 72 28h112c6.627 0 12 5.373 12 12v68h20c2.209 0 4 1.791 4 4-.022 35.303-20.22 67.487-52 82.86ZM68 108h120v-68c0-2.209-1.791-4-4-4h-112c-2.209 0-4 1.791-4 4ZM160.34 198.13c-20.849 7.829-43.831 7.829-64.68 0L92 223.43c-.164 1.149 .179 2.313 .94 3.19 .762 .894 1.885 1.401 3.06 1.38h64c1.154 .003 2.251-.502 3-1.38 .761-.877 1.104-2.041 .94-3.19ZM211.91 116h-167.82c2.077 44.832 39.03 80.113 83.91 80.113 44.88 0 81.833-35.28 83.91-80.113Z"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
