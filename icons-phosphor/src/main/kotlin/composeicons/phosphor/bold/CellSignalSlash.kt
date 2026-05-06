package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorBoldIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 152v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM40 180c-6.627 0-12 5.373-12 12v8c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-8c0-6.627-5.373-12-12-12ZM216.88 207.93 56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L108 123.84v76.16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-49.76l16 17.6v32.16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-5.76l27.12 29.83c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM160 115.74c6.627 0 12-5.373 12-12v-31.74c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v31.74c0 6.627 5.373 12 12 12ZM200 159.74c6.627 0 12-5.373 12-12v-115.74c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v115.74c0 6.627 5.373 12 12 12Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
