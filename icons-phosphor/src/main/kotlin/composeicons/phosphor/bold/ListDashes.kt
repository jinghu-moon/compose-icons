package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorBoldIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 64C84 57.373 89.373 52 96 52h120c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-120C89.373 76 84 70.627 84 64ZM216 116h-120c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h120c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM216 180h-120c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h120c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM56 52h-16C33.373 52 28 57.373 28 64c0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12C68 57.373 62.627 52 56 52ZM56 116h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM56 180h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
