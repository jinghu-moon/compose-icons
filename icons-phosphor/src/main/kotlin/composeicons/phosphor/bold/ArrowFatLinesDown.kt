package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) return _arrowFatLinesDown!!
        _arrowFatLinesDown = phosphorBoldIcon(
            name = "ArrowFatLinesDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.09 131.41C233.233 126.924 228.855 123.999 224 124h-36v-4c0-6.627-5.373-12-12-12h-96c-6.627 0-12 5.373-12 12v4h-36c-4.856-.004-9.236 2.92-11.095 7.407-1.859 4.487-.83 9.651 2.605 13.083l96 96c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l96-96c3.426-3.437 4.444-8.599 2.58-13.08ZM128 215 61 148h19c6.627 0 12-5.373 12-12v-4h72v4c0 6.627 5.373 12 12 12h19ZM68 40C68 33.373 73.373 28 80 28h96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-96C73.373 52 68 46.627 68 40ZM68 80C68 73.373 73.373 68 80 68h96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-96C73.373 92 68 86.627 68 80Z"),
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
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null
