package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorBoldIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 124h-40.58l-24-48h12.58c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-128C57.373 52 52 57.373 52 64c0 6.627 5.373 12 12 12h12.58l-24 48h-40.58C5.373 124 0 129.373 0 136c0 6.627 5.373 12 12 12h28.58L21.27 186.63c-2.042 3.848-1.837 8.501 .533 12.155 2.371 3.655 6.536 5.737 10.882 5.441 4.346-.296 8.191-2.924 10.044-6.866L67.42 148h121.16l24.69 49.36c1.854 3.942 5.698 6.57 10.044 6.866 4.346 .296 8.511-1.787 10.882-5.441 2.371-3.655 2.575-8.307 .533-12.155L215.42 148h28.58c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM79.42 124l24-48h49.16l24 48Z"),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
